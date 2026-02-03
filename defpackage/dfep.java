package defpackage;

import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfep implements dfhz {
    final /* synthetic */ dfer a;

    public dfep(dfer dferVar) {
        this.a = dferVar;
    }

    @Override // defpackage.dfhz
    public final void a(dgyx dgyxVar, long j, String str) throws XmlPullParserException {
        boolean z = dgyxVar.q;
        if (dgyxVar.o) {
            this.a.p(dgyxVar, str, j, z);
        } else {
            this.a.p(dgyxVar, str, -1L, z);
        }
    }
}
