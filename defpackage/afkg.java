package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afkg extends fcyz implements fdat {
    final /* synthetic */ afki a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afkg(fcxy fcxyVar, afki afkiVar, ConversationIdType conversationIdType, List list) {
        super(2, fcxyVar);
        this.a = afkiVar;
        this.b = conversationIdType;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afkg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0132, code lost:
    
        r1 = (defpackage.ekrd) defpackage.afki.a.g().h("com/google/android/apps/messaging/messageclassifications/ConversationClassificationPersisterImpl", "write", 156, "ConversationClassificationPersisterImpl.kt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
    
        if (r6.b != 5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0144, code lost:
    
        r2 = (defpackage.ezea) r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0149, code lost:
    
        r2 = defpackage.ezea.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        r2 = defpackage.ezdz.b(r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0151, code lost:
    
        if (r2 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0153, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
    
        r1.r("Skipping writing classification type %d because the type was not eligible.", defpackage.ezdz.a(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015f, code lost:
    
        r1 = (defpackage.ekrd) defpackage.afki.a.g().h("com/google/android/apps/messaging/messageclassifications/ConversationClassificationPersisterImpl", "write", 145, "ConversationClassificationPersisterImpl.kt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016f, code lost:
    
        if (r6.b != 5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0171, code lost:
    
        r2 = (defpackage.ezea) r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0176, code lost:
    
        r2 = defpackage.ezea.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0178, code lost:
    
        r2 = defpackage.ezdz.b(r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017e, code lost:
    
        if (r2 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0180, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0181, code lost:
    
        r1.r("Skipping writing classification type %d because the conversation was started by the user.", defpackage.ezdz.a(r2));
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afkg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afkg afkgVar = new afkg(fcxyVar, this.a, this.b, this.c);
        afkgVar.d = obj;
        return afkgVar;
    }
}
