package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnst extends FrameLayout {
    static final /* synthetic */ fdeh[] a;
    public static final /* synthetic */ int g = 0;
    public final int b;
    public final fdap c;
    public final fdcz d;
    public final LayoutInflater e;
    public final fdcz f;
    private final fctc h;
    private final fdcz i;

    static {
        fdbv fdbvVar = new fdbv(dnst.class, "configuration", "getConfiguration()Lcom/google/android/libraries/compose/emoji/ui/screen/EmojiConfiguration;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar, new fdbv(dnst.class, "emojiSet", "getEmojiSet()Lcom/google/android/libraries/compose/emoji/data/EmojiSet;", 0), new fdbv(dnst.class, "anchorTop", "getAnchorTop()I", 0)};
    }

    public dnst(final Context context, int i, fdap fdapVar) {
        super(context);
        this.b = i;
        this.c = fdapVar;
        this.d = new dnsq(this);
        this.e = LayoutInflater.from(context);
        this.h = fctd.a(new fdae() { // from class: dnsm
            @Override // defpackage.fdae
            public final Object invoke() {
                int i2 = dnst.g;
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.emoji_item_icon_padding));
            }
        });
        this.i = new dnsr(this);
        this.f = new dnss(0, this);
    }

    public final int a() {
        return ((Number) this.h.a()).intValue();
    }

    public final dnmj b() {
        return (dnmj) this.i.c(a[1]);
    }

    public final dnov c() {
        return (dnov) this.d.c(a[0]);
    }

    public abstract dnso d();

    public final void e(dnmj dnmjVar) {
        this.i.d(a[1], dnmjVar);
    }
}
