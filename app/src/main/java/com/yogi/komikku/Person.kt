import android.os.Parcel
import android.os.Parcelable

data class Person(val imgKomik: Int,
                  val nameKomik: String,
                  val descKomik: String,
                  val imgDetail: Int,
                  val chapter: Int,
                  val rate: String) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imgKomik)
        parcel.writeString(nameKomik)
        parcel.writeString(descKomik)
        parcel.writeInt(imgDetail)
        parcel.writeInt(chapter)
        parcel.writeString(rate)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }
}
