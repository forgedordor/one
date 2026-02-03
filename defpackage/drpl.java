package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerLayoutManager;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drpl implements AutoCloseable {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController");
    public final Context b;
    public final drob c;
    public final drrs d;
    public final RecyclerView e;
    public final drpj f;
    public final drpo g;
    public float h;
    public final dros i;

    public drpl(drob drobVar, dros drosVar, drpj drpjVar, RecyclerView recyclerView, drpq drpqVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(recyclerView.getContext(), R.style.EmojiPicker);
        this.b = contextThemeWrapper;
        this.c = drobVar;
        this.i = drosVar;
        this.f = drpjVar;
        drpqVar.g();
        boolean zD = drpqVar.d();
        drpqVar.h();
        drrj drrjVar = new drrj(contextThemeWrapper, zD);
        this.d = drrjVar;
        drrjVar.c = new View.OnClickListener() { // from class: drpd
            /* JADX WARN: Type inference failed for: r2v2, types: [dror, dros] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!(view instanceof EmojiView)) {
                    ((ekrd) ((ekrd) drpl.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController", "createEmojiVariantClickListener", 126, "EmojiListController.java")).t("Clicked view is not EmojiView: %s", view);
                    return;
                }
                drpl drplVar = this.a;
                EmojiView emojiView = (EmojiView) view;
                drplVar.c.d(emojiView.c.b);
                droq.b(drplVar.i, drsy.a(emojiView.c.b));
                drplVar.f.b(emojiView.c);
                drplVar.g.q(emojiView.c.c);
            }
        };
        int iA = drpqVar.a();
        int iB = drpqVar.b();
        drpg drpgVar = new drpg(this);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: drpf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                druo.a(view.getContext()).d(view);
                if (view instanceof CustomImageView) {
                    drtm drtmVar = ((CustomImageView) view).a;
                    throw null;
                }
                ((ekrd) ((ekrd) drpl.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController", "createImageClickListener", 60, "EmojiListController.java")).t("Clicked view is not CustomImageView: %s", view);
            }
        };
        drsj drsjVar = drsl.instance.j;
        drpqVar.f();
        drpqVar.e();
        drpo drpoVar = new drpo(iA, iB, drobVar, drpgVar, contextThemeWrapper, onClickListener, drsjVar, drpqVar.c());
        this.g = drpoVar;
        recyclerView.al(drpoVar);
        EmojiPickerLayoutManager emojiPickerLayoutManager = new EmojiPickerLayoutManager(drpqVar.a());
        emojiPickerLayoutManager.g = new drph(this, drpqVar);
        recyclerView.ao(emojiPickerLayoutManager);
        recyclerView.ak(new drpk(this, recyclerView));
        this.e = recyclerView;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.a();
    }
}
