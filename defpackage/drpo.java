package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpo extends drrw {
    private static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiListHolderAdapter");
    private ekgb d;
    private final int e;
    private final int f;
    private final drob g;
    private final drtj h;
    private final View.OnClickListener i;
    private final drsj j;
    private final LayoutInflater k;
    private final CharSequence l;

    public drpo(int i, int i2, drob drobVar, drtj drtjVar, Context context, View.OnClickListener onClickListener, drsj drsjVar, CharSequence charSequence) {
        super(context);
        this.e = i;
        this.f = i2;
        this.g = drobVar;
        this.h = drtjVar;
        this.i = onClickListener;
        this.j = drsjVar;
        this.l = charSequence;
        int i3 = ekgb.d;
        this.d = ekoe.a;
        this.k = LayoutInflater.from(context);
    }

    @Override // defpackage.vo
    public final int a() {
        return ((ekoe) this.d).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final int dF(int i) {
        return ((drrx) this.d.get(i)).a();
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        View viewInflate;
        if (i == drrn.a) {
            return new drro(viewGroup, this.k, L(viewGroup) / this.e, this.f, this.h);
        }
        if (i == drru.a) {
            return new drrv(viewGroup, L(viewGroup) / this.e, this.f, this.i, this.h);
        }
        if (i == drrp.a) {
            viewInflate = this.k.inflate(R.layout.emoji_picker_empty_category_text_view, viewGroup, false);
        } else if (i == drsb.a) {
            viewInflate = this.k.inflate(R.layout.loading_category_view_holder, viewGroup, false);
        } else if (i == drrq.a) {
            viewInflate = this.k.inflate(R.layout.error_category_view_holder, viewGroup, false);
        } else {
            ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListHolderAdapter", "onCreateViewHolder", 135, "EmojiListHolderAdapter.java")).q("Update emoji list contains unsupported Item input.");
            View view = new View(this.s);
            view.setLayoutParams(new ViewGroup.LayoutParams(L(viewGroup) / this.e, this.f));
            viewInflate = view;
        }
        return new drpn(viewInflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        int iDF = dF(i);
        if (iDF == drrn.a) {
            drrn drrnVar = (drrn) this.d.get(i);
            drro drroVar = (drro) wvVar;
            final CharSequence charSequence = this.l;
            boolean z = false;
            if (charSequence != null && (drrnVar.d.contentEquals(charSequence) || Collection.EL.stream(drrnVar.e).anyMatch(new Predicate() { // from class: drpm
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((String) obj).contentEquals(charSequence);
                }
            }))) {
                z = true;
            }
            drst drstVar = new drst(drse.a(drrnVar, drrnVar.c, drrnVar.b, -1, this.g));
            drstVar.f(z);
            drroVar.C(drstVar.a(), drrnVar.e);
            int i2 = this.e;
            View view = drroVar.a;
            K(-1, i2, view);
            J(view, drrnVar);
            return;
        }
        if (iDF == drru.a) {
            throw null;
        }
        if (iDF == drrp.a) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) wvVar.a.findViewById(R.id.emoji_picker_empty_category_view);
            if (appCompatTextView != null) {
                appCompatTextView.setText(((drrp) this.d.get(i)).c);
                return;
            }
            return;
        }
        if (iDF == drrq.a) {
            TextView textView = (TextView) wvVar.a.findViewById(R.id.error_category_text);
            textView.setText((CharSequence) null);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void l(ekgb ekgbVar) {
        this.d = drsa.a(this.g.a(), ekgbVar, -1, this.j, true, true);
        p();
    }
}
