package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrp extends fcyz implements fdat {
    int a;
    final /* synthetic */ csrt b;
    final /* synthetic */ String c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ eykc e;
    final /* synthetic */ cspj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csrp(csrt csrtVar, String str, ConversationIdType conversationIdType, eykc eykcVar, cspj cspjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csrtVar;
        this.c = str;
        this.d = conversationIdType;
        this.e = eykcVar;
        this.f = cspjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csrp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
        } catch (Throwable th) {
            ekrw ekrwVarJ = csrt.a.j();
            ekrwVarJ.X(eksq.a, "BugleSpam");
            ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamReporter$sendActionEnforcedSignal$1", "invokeSuspend", 151, "TachyonSpamReporter.kt")).q("Failed to send enforcement signal to Tachyon");
        }
        if (this.a == 0) {
            fctl.b(obj);
            csrt csrtVar = this.b;
            ParticipantsTable.BindData bindDataB = ((bbca) csrtVar.b.b()).b(this.c);
            if (bindDataB != null) {
                csrb csrbVar = (csrb) csrtVar.d.b();
                csrn csrnVarA = csrtVar.a(this.d, bindDataB);
                eykc eykcVar = this.e;
                cspj cspjVar = this.f;
                this.a = 1;
                if (csrbVar.o(bindDataB, csrnVarA, eykcVar, cspjVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
            return fctx.a;
        }
        fctl.b(obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csrp(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
