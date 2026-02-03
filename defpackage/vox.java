package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vox extends fcyz implements fdat {
    int a;
    final /* synthetic */ voz b;
    final /* synthetic */ ResolvedRecipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vox(voz vozVar, ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vozVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vox) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        Object objA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            voz vozVar = this.b;
            vozVar.c.b(9);
            csyj csyjVar = (csyj) vozVar.d.b();
            ResolvedRecipient resolvedRecipient = this.c;
            this.a = 1;
            objC = csyjVar.c(resolvedRecipient, this);
            if (objC == fcylVar) {
                return fcylVar;
            }
        } else {
            if (i != 1) {
                objA = obj;
                ((Boolean) objA).booleanValue();
                return fctx.a;
            }
            objC = obj;
        }
        String str = (String) objC;
        if (str == null) {
            return fctx.a;
        }
        int i2 = true != fdgn.G(str, "meet.google.com", false) ? R.string.duokit_invite_template : R.string.meet_invite_template;
        voz vozVar2 = this.b;
        wwd wwdVar = (wwd) vozVar2.e.b();
        IncomingDraft incomingDraft = new IncomingDraft(vozVar2.a.getString(i2, str), null, null, false, null, null, false, 126, null);
        vow vowVar = new vow(null);
        this.a = 2;
        objA = wwdVar.a(incomingDraft, vowVar, this);
        if (objA == fcylVar) {
            return fcylVar;
        }
        ((Boolean) objA).booleanValue();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vox(this.b, this.c, fcxyVar);
    }
}
