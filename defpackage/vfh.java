package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vfh extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ vfi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfh(vfi vfiVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = vfiVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vfh vfhVar = new vfh(this.c, (fcxy) obj3);
        vfhVar.a = (ekgb) obj;
        vfhVar.b = (ajlk) obj2;
        return vfhVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        alqm alqmVarG;
        fctl.b(obj);
        ?? r1 = this.a;
        final ?? r5 = this.b;
        ajlj ajljVarC = r5.c();
        ajlj ajljVar = ajlj.GROUP;
        final ResolvedRecipient resolvedRecipient = ajljVarC == ajljVar ? null : (ResolvedRecipient) fcva.P(r1);
        int i = r5.c() == ajljVar ? 3 : r5.c() == ajlj.RBM ? 4 : (resolvedRecipient == null || !resolvedRecipient.z()) ? 1 : 2;
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && resolvedRecipient != null && (alqmVarG = resolvedRecipient.g()) != null && alqmVarG.z()) {
            return null;
        }
        boolean z = i != 3 ? !(resolvedRecipient == null || (resolvedRecipient.z() && resolvedRecipient.H().d())) : !r5.i().f();
        String string = (i == 2 || i == 3) ? this.c.b.getString(R.string.report_spam_action_title) : (resolvedRecipient == null || !resolvedRecipient.H().d()) ? this.c.b.getString(R.string.block_and_report_spam) : this.c.b.getString(R.string.block_action_title);
        string.getClass();
        djrr djrrVar = (i == 2 || i == 3) ? djrr.dp : djrr.E;
        final vfi vfiVar = this.c;
        final int i2 = i;
        final boolean z2 = z;
        return new dihq(string, djrrVar, false, true, z, false, null, false, null, new fdae() { // from class: vfg
            @Override // defpackage.fdae
            public final Object invoke() {
                if (!z2) {
                    ekrw ekrwVarJ = vfi.a.j();
                    ekrwVarJ.X(eksq.a, "BugleSpam");
                    ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/actions/blockandreportspam/BlockAndReportSpamActionPlugin$actionFlow$1", "invokeSuspend$lambda$0", 97, "BlockAndReportSpamActionPlugin.kt")).q("BlockAndReportSpamActionPlugin: plugin invoked when invisible.");
                    return fctx.a;
                }
                ResolvedRecipient resolvedRecipient2 = resolvedRecipient;
                int i3 = i2;
                ConversationId conversationIdD = r5.d();
                conversationIdD.getClass();
                if (i3 == 3) {
                    if (resolvedRecipient2 != null) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    resolvedRecipient2 = null;
                } else if (resolvedRecipient2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                vfi vfiVar2 = vfiVar;
                vfiVar2.e.a(new tlk(resolvedRecipient2, conversationIdD, i3, vfiVar2.f));
                return fctx.a;
            }
        }, 996);
    }
}
