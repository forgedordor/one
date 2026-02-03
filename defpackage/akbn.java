package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akbn extends fcyz implements fdat {
    int a;
    final /* synthetic */ akbq b;
    final /* synthetic */ boolean c;
    final /* synthetic */ List d;
    final /* synthetic */ ConversationIdType e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbn(fcxy fcxyVar, akbq akbqVar, boolean z, List list, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.b = akbqVar;
        this.c = z;
        this.d = list;
        this.e = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akbn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        akbn akbnVar = new akbn(fcxyVar, this.b, this.c, this.d, this.e);
        akbnVar.f = obj;
        return akbnVar;
    }
}
