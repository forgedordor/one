package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esgl implements esgt {
    final FirebaseInstanceId a;

    public esgl(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // defpackage.esgt
    public final defn a() {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String strH = firebaseInstanceId.h();
        if (strH != null) {
            return degc.c(strH);
        }
        erzj erzjVar = firebaseInstanceId.d;
        FirebaseInstanceId.k(erzjVar);
        return firebaseInstanceId.a(esgh.e(erzjVar), "*").b(new deeq() { // from class: esgk
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                return ((esgg) defnVar.i()).a;
            }
        });
    }

    @Override // defpackage.esgt
    public final void b(esja esjaVar) {
        this.a.h.add(esjaVar);
    }

    @Override // defpackage.esgt
    public final void c() {
        this.a.h();
    }
}
