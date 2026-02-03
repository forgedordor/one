package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xvv extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ xvw e;
    final /* synthetic */ dpfy f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvv(String str, MessageId messageId, xvw xvwVar, dpfy dpfyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = str;
        this.d = messageId;
        this.e = xvwVar;
        this.f = dpfyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xvv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdjx fdjxVar;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fdjxVar = (fdjx) this.g;
            try {
                fctl.b(obj);
                this.e.l.f(false);
                ekrw ekrwVarF = xvw.a.f();
                ekrwVarF.X(eksq.a, "BugleMediaViewer");
                ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/mediaviewer2/MediaViewerComposeRowUiAdapter$onSend$1$1", "invokeSuspend", 196, "MediaViewerComposeRowUiAdapter.kt")).D("Ending %s.onSend for %s", fdjxVar.getClass().getSimpleName(), obj2);
                return fctx.a;
            } catch (Throwable th) {
                th = th;
                this.e.l.f(false);
                ekrw ekrwVarF2 = xvw.a.f();
                ekrwVarF2.X(eksq.a, "BugleMediaViewer");
                ((ekrd) ekrwVarF2.h("com/google/android/apps/messaging/conversation2/mediaviewer2/MediaViewerComposeRowUiAdapter$onSend$1$1", "invokeSuspend", 196, "MediaViewerComposeRowUiAdapter.kt")).D("Ending %s.onSend for %s", fdjxVar.getClass().getSimpleName(), obj2);
                throw th;
            }
        }
        fctl.b(obj);
        fdjxVar = (fdjx) this.g;
        String str = this.c;
        vvw vvwVar = new vvw(str, (List) null, (String) null, false, this.d, (EditingData) null, (Instant) null, false, 0, false, 2030);
        try {
            xvw xvwVar = this.e;
            fdjx fdjxVar2 = xvwVar.e;
            try {
                xvu xvuVar = new xvu(xvwVar, vvwVar, this.f, str, null);
                vvwVar = vvwVar;
                fdlr fdlrVarK = auvw.k(fdjxVar2, null, null, xvuVar, 3);
                this.g = fdjxVar;
                this.a = vvwVar;
                this.b = 1;
                if (fdlrVarK.o(this) == fcylVar) {
                    return fcylVar;
                }
                obj2 = vvwVar;
                this.e.l.f(false);
                ekrw ekrwVarF3 = xvw.a.f();
                ekrwVarF3.X(eksq.a, "BugleMediaViewer");
                ((ekrd) ekrwVarF3.h("com/google/android/apps/messaging/conversation2/mediaviewer2/MediaViewerComposeRowUiAdapter$onSend$1$1", "invokeSuspend", 196, "MediaViewerComposeRowUiAdapter.kt")).D("Ending %s.onSend for %s", fdjxVar.getClass().getSimpleName(), obj2);
                return fctx.a;
            } catch (Throwable th2) {
                th = th2;
                vvwVar = vvwVar;
                obj2 = vvwVar;
                this.e.l.f(false);
                ekrw ekrwVarF22 = xvw.a.f();
                ekrwVarF22.X(eksq.a, "BugleMediaViewer");
                ((ekrd) ekrwVarF22.h("com/google/android/apps/messaging/conversation2/mediaviewer2/MediaViewerComposeRowUiAdapter$onSend$1$1", "invokeSuspend", 196, "MediaViewerComposeRowUiAdapter.kt")).D("Ending %s.onSend for %s", fdjxVar.getClass().getSimpleName(), obj2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xvv xvvVar = new xvv(this.c, this.d, this.e, this.f, fcxyVar);
        xvvVar.g = obj;
        return xvvVar;
    }
}
