package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbwe implements fbra {
    private final Parcelable.Creator a;
    private final boolean b;

    public fbwe(Parcelable.Creator creator, boolean z) {
        this.a = creator;
        this.b = z;
    }

    @Override // defpackage.fbra
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        boolean z = this.b;
        return new fbwr(this.a, (Parcelable) obj, z);
    }

    @Override // defpackage.fbra
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        if (!(inputStream instanceof fbwr)) {
            throw new UnsupportedOperationException("Can't unmarshall a parcelable from a regular byte stream");
        }
        fbwr fbwrVar = (fbwr) inputStream;
        if (fbwrVar.b) {
            return fbwrVar.c;
        }
        if (fbwrVar.e == null) {
            Parcelable parcelable = fbwrVar.c;
            Parcelable.Creator creator = fbwrVar.a;
            creator.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            Parcelable parcelable2 = (Parcelable) creator.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            fbwrVar.e = parcelable2;
        }
        return fbwrVar.e;
    }
}
