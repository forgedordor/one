package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabe implements dnih {
    final /* synthetic */ aabj a;

    public aabe(aabj aabjVar) {
        this.a = aabjVar;
    }

    @Override // defpackage.dnih
    public final dnjo a() {
        return new dnjo(0, 0);
    }

    @Override // defpackage.dnih
    public final /* synthetic */ CharSequence b(boolean z) {
        return "";
    }

    @Override // defpackage.dnih
    public final void f(dnnp dnnpVar) {
        aabj aabjVar = this.a;
        aabjVar.c.hh();
        dnjh dnjhVar = aabjVar.i;
        dnjhVar.a(dnnpVar);
        dnjhVar.d(dnnpVar);
        String string = dnnpVar.b.a().toString();
        fdap fdapVar = aabjVar.o;
        if (fdapVar != null) {
            fdapVar.invoke(string);
            return;
        }
        ekrd ekrdVarA = aabj.b.a(Level.WARNING);
        ekrdVarA.X(eksq.a, "BugleReactions");
        ((ekrd) ekrdVarA.h("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer$emojiReactionHandlingTextController$1", "insertEmojiAtCurrentSelection", 247, "ReactionPickerFragmentPeer.kt")).q("emoji selected before `onSelectEmoji` was initialized");
    }

    @Override // defpackage.dnih
    public final void d() {
    }

    @Override // defpackage.dnih
    public final void e() {
    }

    @Override // defpackage.dnih
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.dnih
    public final void c(CharSequence charSequence) {
    }

    @Override // defpackage.dnih
    public final void g(CharSequence charSequence) {
    }

    @Override // defpackage.dnih
    public final void j(dnjo dnjoVar) {
    }

    @Override // defpackage.dnih
    public final void k(CharSequence charSequence) {
    }

    @Override // defpackage.dnih
    public final void i(fddq fddqVar, CharSequence charSequence) {
    }
}
