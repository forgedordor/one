package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.libraries.stickers.gallery.StickerSearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebxp implements TextView.OnEditorActionListener {
    final /* synthetic */ StickerSearchView a;

    public ebxp(StickerSearchView stickerSearchView) {
        this.a = stickerSearchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        StickerSearchView stickerSearchView = this.a;
        Editable text = stickerSearchView.a.getText();
        if (TextUtils.isEmpty(text)) {
            return true;
        }
        ebxq ebxqVar = stickerSearchView.d;
        if (ebxqVar != null) {
            final ebww ebwwVar = (ebww) ebxqVar;
            ebwwVar.f = text.toString();
            Runnable runnable = ebwwVar.e;
            Handler handler = ebwwVar.c;
            handler.removeCallbacks(runnable);
            ebwwVar.e = new Runnable() { // from class: ebws
                @Override // java.lang.Runnable
                public final void run() {
                    ebwwVar.b(eryy.EXPLICIT_SEARCH_TEXT);
                }
            };
            handler.post(ebwwVar.e);
        }
        stickerSearchView.a();
        return true;
    }
}
