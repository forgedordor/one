package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crwa extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ crwb c;
    final /* synthetic */ MessageCoreData d;
    final /* synthetic */ ParticipantsTable.BindData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crwa(crwb crwbVar, MessageCoreData messageCoreData, ParticipantsTable.BindData bindData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = crwbVar;
        this.d = messageCoreData;
        this.e = bindData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crwa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (defpackage.fdbq.f(r5.as(), r6) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013a, code lost:
    
        if (r7.c(r8, r10, r11, r13) != r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crwa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crwa(this.c, this.d, this.e, fcxyVar);
    }
}
