import android.location.Address
import java.io.Serializable

class Person(var id:String,
            var name:String,
            var emailId:String,
            var phoneNO:String,
            var address: String,
            var latitude:Double,
            var longitude:Double): Serializable {


}