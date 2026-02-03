package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdnz extends fcyz implements fdat {
    final /* synthetic */ cdoa a;
    final /* synthetic */ cdnl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdnz(cdoa cdoaVar, cdnl cdnlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cdoaVar;
        this.b = cdnlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdnz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final cdoa cdoaVar = this.a;
        dqsn dqsnVar = (dqsn) cdoaVar.g.b();
        final cdnl cdnlVar = this.b;
        dqsnVar.d("ParentAllowlistUpdateHandler#updateConversationParentStateInDb", new Runnable() { // from class: cdny
            @Override // java.lang.Runnable
            public final void run() {
                fcsu fcsuVar = cdoaVar.h;
                cdnl cdnlVar2 = cdnlVar;
                cdmg.d(cdnlVar2.a);
                for (Map.Entry entry : cdnlVar2.b.entrySet()) {
                    cdmg.e((ConversationIdType) entry.getKey(), (akbj) entry.getValue());
                }
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdnz(this.a, this.b, fcxyVar);
    }
}
