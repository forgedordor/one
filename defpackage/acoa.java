package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.home.ArchivedActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acoa extends acob implements acop, efzm {
    public final ArchivedActivity a;
    public final fcsu b;
    public final daip c;
    private final fcsu e;
    private final fcsu f;

    public acoa(ArchivedActivity archivedActivity, daip daipVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = archivedActivity;
        this.c = daipVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.b = fcsuVar4;
        efxf efxfVar = (efxf) fcsuVar.b();
        efxfVar.g(egaq.g(archivedActivity));
        efxfVar.e(this);
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        acoc.a(this.a, efzkVar, "archived_fragment_tag", cdpg.ARCHIVED);
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ((abxv) this.e.b()).a(efygVar);
    }

    @Override // defpackage.efzm
    public final void d() {
        ((aisx) this.f.b()).b(this.a, 195359);
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
