package defpackage;

import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvik implements cpbh {
    final /* synthetic */ VCardAttachmentView a;

    public cvik(VCardAttachmentView vCardAttachmentView) {
        this.a = vCardAttachmentView;
    }

    @Override // defpackage.cpbh
    public final void c(bajr bajrVar) {
        if (bajrVar instanceof baiy) {
            baiy baiyVar = (baiy) bajrVar;
            if (baiyVar.q()) {
                VCardAttachmentView vCardAttachmentView = this.a;
                vCardAttachmentView.a.b(vCardAttachmentView.getContext(), baiyVar.o());
            }
        }
    }

    @Override // defpackage.cpbh
    public final void d() {
    }
}
