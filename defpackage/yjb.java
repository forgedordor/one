package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjb implements fdau {
    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ixp ixpVar = (ixp) obj;
        ixk ixkVar = (ixk) obj2;
        long j = ((kil) obj3).a;
        Trace.beginSection(fdgn.Z("measureMessageBubble", 126));
        try {
            iyl iylVarE = ixkVar.e(j);
            return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new yja(iylVarE));
        } finally {
            Trace.endSection();
        }
    }
}
