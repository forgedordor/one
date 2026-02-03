package defpackage;

import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwwb extends wv implements cpbh {
    public final badt s;
    public final bajr t;
    final /* synthetic */ cwwc u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwwb(cwwc cwwcVar, VCardAttachmentView vCardAttachmentView) {
        super(vCardAttachmentView);
        this.u = cwwcVar;
        this.s = (badt) cwwcVar.f.b();
        this.t = new cwwa(this);
    }

    @Override // defpackage.cpbh
    public final void c(bajr bajrVar) {
        ((cwwk) this.u.g).l.b(this.s);
    }

    @Override // defpackage.cpbh
    public final void d() {
    }
}
