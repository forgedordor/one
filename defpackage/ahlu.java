package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahlu {
    final /* synthetic */ ahmz a;

    public ahlu(ahmz ahmzVar) {
        this.a = ahmzVar;
    }

    public final awzm a(awyv awyvVar) {
        ahnh ahnhVar = this.a.a.a;
        Optional optionalOf = Optional.of((dghj) ahnhVar.rW.b());
        alrj alrjVar = (alrj) ahnhVar.qi.b();
        awvj awvjVar = (awvj) ahnhVar.qy.b();
        fdjx fdjxVar = (fdjx) ahnhVar.oQ.b();
        final eyik eyikVar = ahnhVar.oO;
        return new awzm(awyvVar, optionalOf, alrjVar, awvjVar, fdjxVar, new arpj() { // from class: aroy
            @Override // defpackage.arpj
            public final boolean a() {
                return ((eoth) eyikVar.b()).a("bugle.update_get_phone_messaging_identity");
            }
        });
    }
}
