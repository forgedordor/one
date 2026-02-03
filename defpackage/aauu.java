package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauu implements Comparable<aauu>, Parcelable {
    public static final Parcelable.Creator<aauu> CREATOR = new aaur();
    public final String a;
    public final String b;
    public final ekgb c;
    public int d;

    public aauu(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.a = string;
        String string2 = parcel.readString();
        string2.getClass();
        this.b = string2;
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, aaut.CREATOR);
        this.c = ekgb.n(arrayList);
        this.d = parcel.readInt();
    }

    final int a() {
        return this.c.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final long b(int i) {
        return ((aaut) this.c.get(i)).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Spanned c(int i) {
        return ((aaut) this.c.get(i)).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(aauu aauuVar) {
        return ((aaut) this.c.get(0)).compareTo((aaut) aauuVar.c.get(0));
    }

    final void d(final boolean z) {
        Collection.EL.stream(this.c).forEach(new Consumer() { // from class: aauq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((aaut) obj).e = z;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.d = z ? a() : 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean e(int i) {
        return ((aaut) this.c.get(i)).e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
        parcel.writeInt(this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aauu(aarh aarhVar) {
        ejwl.a(!aarhVar.a().isEmpty());
        this.a = ((aarg) aarhVar.a().get(0)).d();
        this.b = ((aarg) aarhVar.a().get(0)).c();
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVarA = aarhVar.a();
        int size = ekgbVarA.size();
        for (int i = 0; i < size; i++) {
            aarg aargVar = (aarg) ekgbVarA.get(i);
            ejwl.b(aargVar.e(), "ParticipantMessageList only supports incoming messages");
            ejwl.i(TextUtils.equals(this.a, aargVar.d()), "ParticipantMessageList only supports 1:1 conversations, normalizedDestination: %s | message.normalizedDestination: %s", cqcv.b(this.a), cqcv.b(aargVar.d()));
            ekfwVar.h(new aaut(aargVar));
        }
        ekgb ekgbVarD = ekgb.D(ekfwVar.g());
        this.c = ekgbVarD;
        this.d = ekgbVarD.size();
    }
}
