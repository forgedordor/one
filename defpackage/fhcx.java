package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcx extends fhdn {
    final /* synthetic */ fhdn a;

    public fhcx(fhdn fhdnVar) {
        this.a = fhdnVar;
    }

    @Override // defpackage.fhdn
    public final void a(fhds fhdsVar, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.a(fhdsVar, Array.get(obj, i));
        }
    }
}
