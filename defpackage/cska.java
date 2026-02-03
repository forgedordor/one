package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cska extends fcyz implements fdat {
    Object a;
    Object b;
    boolean c;
    int d;
    final /* synthetic */ MessageIdType e;
    final /* synthetic */ List f;
    final /* synthetic */ cskc g;
    final /* synthetic */ ConversationIdType h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cska(MessageIdType messageIdType, List list, cskc cskcVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = messageIdType;
        this.f = list;
        this.g = cskcVar;
        this.h = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cska) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x034e, code lost:
    
        if (r1.a(r0, r2, r31) == r10) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030f A[PHI: r0 r2 r15
      0x030f: PHI (r0v75 java.lang.Object) = (r0v61 java.lang.Object), (r0v90 java.lang.Object) binds: [B:130:0x030d, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r2v25 java.lang.Object) = (r2v24 java.lang.Object), (r2v28 java.lang.Object) binds: [B:130:0x030d, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r15v12 java.lang.String) = (r15v11 java.lang.String), (r15v14 java.lang.String) binds: [B:130:0x030d, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0351  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cska.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cska(this.e, this.f, this.g, this.h, fcxyVar);
    }
}
