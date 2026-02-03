package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckyo extends fcyz implements fdau {
    int a;
    final /* synthetic */ ckyt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckyo(ckyt ckytVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = ckytVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ckyo ckyoVar = new ckyo(this.b, (fcxy) obj3);
        ckyoVar.c = (ckyl) obj;
        return ckyoVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object obj2 = this.c;
            ckyt ckytVar = this.b;
            ckyl ckylVar = (ckyl) obj2;
            ConversationIdType conversationIdTypeB = barn.b(ckylVar.c);
            String str = ckylVar.d;
            str.getClass();
            MessageIdType messageIdTypeB = bary.b(ckylVar.e);
            Duration durationOfMillis = Duration.ofMillis(ckylVar.g);
            durationOfMillis.getClass();
            ezgd ezgdVar = ckylVar.f;
            if (ezgdVar == null) {
                ezgdVar = ezgd.a;
            }
            ezgdVar.getClass();
            int iA = cklf.a(ckylVar.h);
            this.a = 1;
            if (ckytVar.b(conversationIdTypeB, str, messageIdTypeB, durationOfMillis, ezgdVar, iA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcw.i();
    }
}
