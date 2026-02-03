package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.home.SpamFolderActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsg extends acsh implements acop, efzm {
    public final SpamFolderActivity a;
    public final cgbn b;
    public final crtq c;
    public final fcsu d;
    public final daip e;
    private final fcsu g;
    private final fcsu h;

    public acsg(SpamFolderActivity spamFolderActivity, daip daipVar, cgbn cgbnVar, crtq crtqVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Optional optional, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.a = spamFolderActivity;
        this.e = daipVar;
        this.b = cgbnVar;
        this.c = crtqVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.d = fcsuVar5;
        if (!abxb.a()) {
            efxf efxfVar = (efxf) fcsuVar.b();
            egap egapVarE = egaq.e(spamFolderActivity);
            egapVarE.d(sqx.class);
            efxfVar.e(this);
            efxfVar.g(egapVarE.a());
            optional.ifPresent(new Consumer() { // from class: acsf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((sqv) ((fcsu) obj).b()).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        efxf efxfVar2 = (efxf) fcsuVar.b();
        egap egapVarE2 = egaq.e(spamFolderActivity);
        egapVarE2.d(egkc.class);
        efxfVar2.e(new egkb((egkc) fcsuVar2.b()));
        egapVarE2.d(eghx.class);
        efxfVar2.e(this);
        efxfVar2.g(egapVarE2.a());
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        acoc.a(this.a, efzkVar, "spam_folder_fragment_tag", cdpg.SPAM_FOLDER);
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ((abxv) this.g.b()).a(efygVar);
    }

    @Override // defpackage.efzm
    public final void d() {
        ((aisx) this.h.b()).b(this.a, 195361);
    }

    @Override // defpackage.acop
    public final Optional e() {
        return this.a.V();
    }

    @Override // defpackage.acop
    public final void f() {
        this.a.W();
    }

    @Override // defpackage.acop
    public final void g() {
        this.a.Y();
    }

    @Override // defpackage.acop
    public final /* synthetic */ void k(ConversationId conversationId, bajg bajgVar) {
        acoo.a(this, conversationId, bajgVar);
    }

    @Override // defpackage.acop
    public final void l(ActionMode.Callback callback, View view) {
        this.a.ac(callback, view);
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.acop
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.acop
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.acop
    public final /* synthetic */ void j(ConversationId conversationId, MessageIdType messageIdType, bajg bajgVar) {
    }
}
