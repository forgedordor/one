package defpackage;

import com.google.android.libraries.geller.portable.Geller;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drej implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ ewak b;
    final /* synthetic */ Geller c;

    public drej(Geller geller, String str, ewak ewakVar) {
        this.a = str;
        this.b = ewakVar;
        this.c = geller;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Long) obj).longValue() > 0) {
            Geller geller = this.c;
            geller.d.onDeletion(this.a, this.b.toByteArray());
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) Geller.a.i()).g(th)).h("com/google/android/libraries/geller/portable/Geller$3", "onFailure", (char) 1649, "Geller.java")).q("Unexpected failure invoking storageOperationsCallback.");
    }
}
