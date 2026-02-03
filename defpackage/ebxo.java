package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.libraries.stickers.gallery.StickerSearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebxo implements TextWatcher {
    final /* synthetic */ StickerSearchView a;

    public ebxo(StickerSearchView stickerSearchView) {
        this.a = stickerSearchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = true != TextUtils.isEmpty(charSequence) ? 0 : 4;
        StickerSearchView stickerSearchView = this.a;
        stickerSearchView.b.setVisibility(i4);
        if (stickerSearchView.d != null && !TextUtils.equals(charSequence, stickerSearchView.c)) {
            final ebww ebwwVar = (ebww) stickerSearchView.d;
            ebwwVar.f = charSequence.toString();
            Handler handler = ebwwVar.c;
            handler.removeCallbacks(ebwwVar.e);
            ebwwVar.e = new Runnable() { // from class: ebwt
                @Override // java.lang.Runnable
                public final void run() {
                    ebwwVar.b(eryy.IMPLICIT_SEARCH_TEXT);
                }
            };
            handler.postDelayed(ebwwVar.e, 500L);
        }
        stickerSearchView.c = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
