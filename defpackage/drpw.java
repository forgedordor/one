package defpackage;

import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpw extends ub {
    final /* synthetic */ drpc c;
    final /* synthetic */ EmojiPickerBodyRecyclerView d;

    public drpw(EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView, drpc drpcVar) {
        this.c = drpcVar;
        this.d = emojiPickerBodyRecyclerView;
    }

    @Override // defpackage.ub
    public final int b(int i) {
        vo voVar = this.d.n;
        if (voVar == null) {
            return 1;
        }
        int iDF = voVar.dF(i);
        if (iDF == droz.a || iDF == drrp.a || iDF == drsb.a || iDF == drrq.a) {
            return this.c.a;
        }
        return 1;
    }
}
