package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csjx extends fcyz implements fdat {
    int a;
    final /* synthetic */ csjz b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ String d;
    final /* synthetic */ MessageIdType e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csjx(fcxy fcxyVar, csjz csjzVar, ConversationIdType conversationIdType, String str, MessageIdType messageIdType) {
        super(2, fcxyVar);
        this.b = csjzVar;
        this.c = conversationIdType;
        this.d = str;
        this.e = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csjx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (((defpackage.csel) r8.b.f.b()).e() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        r9 = r8.c;
        r1 = defpackage.baxe.a;
        r1 = defpackage.eiiy.k("MessageDatabaseOperations#hasOutgoingMessage");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        defpackage.ecem.b();
        r6 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.d();
        r6.A("hasOutgoingMessage");
        r6.h(new defpackage.bavl(r9));
        r9 = r6.b().U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r9 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        r8.b.a(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (((java.lang.Boolean) ((defpackage.cczi) defpackage.crtr.t.get()).e()).booleanValue() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        r9 = defpackage.bbca.e(r8.c);
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r9.isEmpty() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        r9 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        if (r9.hasNext() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (defpackage.bbca.r((com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r9.next()) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        r8.b.a(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        r9 = r8.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        if (r9 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        r1 = (defpackage.csqi) r8.b.d.b();
        r6 = new defpackage.cspo(r9);
        r8.a = 2;
        r9 = r1.c(r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        if (r9 != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
        r9 = (defpackage.csoc) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
    
        if (r9 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        if (r9.i() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
    
        r8.b.a(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fa, code lost:
    
        if (((java.lang.Boolean) ((defpackage.cczi) defpackage.crtr.u.get()).e()).booleanValue() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fc, code lost:
    
        r9 = r8.b;
        r0 = ((defpackage.baxe) r9.c.b()).f(r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010c, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0118, code lost:
    
        if (defpackage.fdbq.f(r0.C(), r8.e) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 != 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011a, code lost:
    
        r9.a(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0132, code lost:
    
        if (((java.lang.Boolean) ((defpackage.cczi) defpackage.crtr.s.get()).e()).booleanValue() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0134, code lost:
    
        r9 = r8.b;
        r0 = ((defpackage.baxe) r9.c.b()).w(r8.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0144, code lost:
    
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0146, code lost:
    
        r1 = r9.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015a, code lost:
    
        if (((defpackage.cpfc) r1.b()).c((byte[]) defpackage.cpez.b.e()) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015d, code lost:
    
        r0 = ((defpackage.cpfc) r1.b()).a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0167, code lost:
    
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0169, code lost:
    
        r1 = defpackage.eyzy.OTP;
        r0 = defpackage.eyzy.b(r0.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0171, code lost:
    
        if (r0 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0173, code lost:
    
        r0 = defpackage.eyzy.UNRECOGNIZED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0175, code lost:
    
        if (r1 != r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0177, code lost:
    
        r9.a(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017c, code lost:
    
        r8.b.a(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0186, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0187, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018c, code lost:
    
        r9.addSuppressed(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r9 != r0) goto L10;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csjx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csjx csjxVar = new csjx(fcxyVar, this.b, this.c, this.d, this.e);
        csjxVar.f = obj;
        return csjxVar;
    }
}
