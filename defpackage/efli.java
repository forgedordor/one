package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class efli {
    public static final Parcelable.Creator a = new eflh();

    public static void a(final Parcel parcel, efdf efdfVar) {
        efmp.r(parcel, 1, efdfVar.c());
        efmp.r(parcel, 2, efdfVar.b());
        final ekgp ekgpVarA = efdfVar.a();
        parcel.writeInt(3);
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int i = ((ekoj) ekgpVarA).d;
        int iDataPosition2 = parcel.dataPosition();
        parcel.writeInt(i);
        Map.EL.forEach(ekgpVarA, new BiConsumer() { // from class: efmk
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                Parcel parcel2 = parcel;
                parcel2.writeString(str);
                parcel2.writeString((String) ekgpVarA.get(str));
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        efmp.k(parcel, iDataPosition, iDataPosition2);
        efmp.l(parcel);
    }
}
