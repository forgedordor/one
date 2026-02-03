package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabd implements dnhq {
    final /* synthetic */ aabj a;

    public aabd(aabj aabjVar) {
        this.a = aabjVar;
    }

    private final void a(dltd dltdVar) {
        if (dltdVar instanceof dnvg) {
            aaag aaagVar = this.a.p;
            if (aaagVar != null) {
                aaagVar.a((dnvg) dltdVar);
            } else {
                ekrd ekrdVarA = aabj.b.a(Level.WARNING);
                ekrdVarA.X(eksq.a, "BugleReactions");
                ((ekrd) ekrdVarA.h("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer$customReactionHandlingAttachmentController$1", "handleAttachment", 213, "ReactionPickerFragmentPeer.kt")).q("Custom sticker selected before customStickerHandler was initialized");
            }
        } else if (dltdVar instanceof dojr) {
            fdap fdapVar = this.a.q;
            if (fdapVar != null) {
                fdapVar.invoke(((dojr) dltdVar).b);
            } else {
                ekrd ekrdVarA2 = aabj.b.a(Level.WARNING);
                ekrdVarA2.X(eksq.a, "BugleReactions");
                ((ekrd) ekrdVarA2.h("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer$customReactionHandlingAttachmentController$1", "handleAttachment", 219, "ReactionPickerFragmentPeer.kt")).q("Image selected before onCameraGalleryMediaSelected was initialized");
            }
        }
        this.a.c.hh();
    }

    @Override // defpackage.dnhq
    public final Object b(dltd dltdVar, dnhn dnhnVar, fcxy fcxyVar) {
        a(dltdVar);
        return false;
    }

    @Override // defpackage.dnhq
    public final void e(dltd dltdVar) {
        dltdVar.getClass();
    }

    @Override // defpackage.dnhq
    public final void f(dltd dltdVar) {
        a(dltdVar);
    }

    @Override // defpackage.dnhq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.dnhq
    public final void d() {
    }
}
