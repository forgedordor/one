package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anhq implements anhs {
    private final anhr a;
    private final anhx b;

    public anhq(anhr anhrVar, anhx anhxVar) {
        this.a = anhrVar;
        this.b = anhxVar;
    }

    private final anhs d(anhj anhjVar) {
        if (anhjVar instanceof angl) {
            return this.a;
        }
        if (anhjVar instanceof angp) {
            return this.b;
        }
        throw new fctg();
    }

    @Override // defpackage.anhs
    public final amwf a(MessageCoreData messageCoreData, anhj anhjVar, anhk anhkVar, boolean z) {
        anhkVar.getClass();
        return d(anhjVar).a(messageCoreData, anhjVar, anhkVar, z);
    }

    @Override // defpackage.anhs
    public final ekgb b(anhj anhjVar, anhk anhkVar) {
        anhkVar.getClass();
        return d(anhjVar).b(anhjVar, anhkVar);
    }

    @Override // defpackage.anhs
    public final void c(MessageCoreData messageCoreData, anhn anhnVar, ajlh ajlhVar, MessageCoreData messageCoreData2, boolean z) {
        ajlhVar.getClass();
        d(anhnVar.b()).c(messageCoreData, anhnVar, ajlhVar, messageCoreData2, z);
    }
}
