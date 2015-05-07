import com.testapp.Role
import com.testapp.User
import com.testapp.UserRole
class BootStrap {
   def init = { servletContext ->
      def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
      def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
      def testUser = new User(username: 'guille', password: 'campoy')
      def testUser2 = new User(username: 'pepe', password: '123456')
      testUser.save(flush: true)
      testUser2.save(flush: true)
      UserRole.create testUser, adminRole, true
      UserRole.create testUser2, userRole, true
      assert User.count() == 2
      assert Role.count() == 2
      assert UserRole.count() == 2
   }
}
