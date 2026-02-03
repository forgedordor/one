package defpackage;

import android.content.Context;
import android.os.Trace;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
class drqw extends drrw {
    public static final ekrg g = ekrg.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerCoreBodyAdapter");
    private CharSequence a;
    private final droc d;
    private final int e;
    private final Map f;
    protected final ekgb h;
    protected final int i;
    protected final float j;
    protected final int k;
    protected final int l;
    public int m;
    public Set n;
    public final droa o;
    protected final drtj p;
    protected drry q;
    protected final LayoutInflater r;

    protected drqw(Context context, drrl drrlVar, ekgb ekgbVar, drtj drtjVar, droc drocVar, droa droaVar) {
        super(context);
        this.m = -1;
        this.n = new HashSet();
        new HashSet();
        this.f = new HashMap();
        ((ekrd) ((ekrd) g.f()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerCoreBodyAdapter", "<init>", 115, "EmojiPickerCoreBodyAdapter.java")).t("Initializing EmojiPickerCoreBodyAdapter with options: %s", drrlVar.toString());
        this.i = drrlVar.c();
        this.j = drrlVar.a();
        this.k = drrlVar.g();
        this.l = drrlVar.e();
        drrlVar.n();
        this.a = drrlVar.h();
        drrlVar.s();
        drrlVar.p();
        drrlVar.m();
        drrlVar.x();
        this.h = ekgbVar;
        this.p = drtjVar;
        this.d = drocVar;
        this.o = droaVar;
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < ((ekoe) ekgbVar).c; i2++) {
            ekfwVar.h(ekoe.a);
        }
        this.q = new drry(ekfwVar.g(), drrlVar.e(), drrlVar.c());
        drrlVar.t();
        this.e = this.q.e;
        this.r = LayoutInflater.from(context);
    }

    final int F(int i) {
        return this.q.b(i);
    }

    final int G(int i) {
        drry drryVar = this.q;
        int i2 = drryVar.b;
        if (i < i2) {
            return drryVar.d[i];
        }
        ((ekrd) drry.a.a(drub.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "getCategoryStartPosition", 152, "ItemViewDataFlatList.java")).u("Too large categoryIndex (%s vs %s)", i, i2);
        return 0;
    }

    protected final int H() {
        return this.q.b;
    }

    protected final void I(drti drtiVar, boolean z) {
        int i;
        if (z) {
            String str = drtiVar.b;
            droa droaVar = this.o;
            if (droaVar.c(str).isEmpty()) {
                return;
            }
            drqv drqvVar = (drqv) this.f.get(droaVar.d(str));
            if (drqvVar != null) {
                droc drocVar = this.d;
                if (drocVar.e() == 2) {
                    int i2 = drqvVar.a;
                    u(G(i2), this.q.b(i2));
                } else {
                    if (drocVar.e() != 1) {
                        p();
                        return;
                    }
                    int i3 = drqvVar.a;
                    int iG = (i3 < this.q.e && (i = drqvVar.b) >= 0 && i < F(i3)) ? G(i3) + i : -1;
                    if (iG != -1) {
                        q(iG);
                    }
                }
            }
        }
    }

    @Override // defpackage.vo
    public final int a() {
        int i = this.q.e;
        if (i == this.e) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return this.q.get(i).a();
    }

    @Override // defpackage.vo
    public wv e(ViewGroup viewGroup, int i) {
        View view;
        wv drroVar;
        plm.a("EmojiPickerCoreBodyAdapter.onCreateViewHolder");
        try {
            if (i == droz.a) {
                view = this.r.inflate(R.layout.category_text_view, viewGroup, false);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            } else if (i == drrp.a) {
                View viewInflate = this.r.inflate(R.layout.emoji_picker_empty_category_text_view, viewGroup, false);
                float f = this.j;
                viewInflate.setMinimumHeight(f > 0.0f ? (int) (viewGroup.getMeasuredHeight() / f) : this.k);
                view = viewInflate;
            } else {
                if (i == drrn.a) {
                    LayoutInflater layoutInflater = this.r;
                    int iL = L(viewGroup) / this.i;
                    float f2 = this.j;
                    drroVar = new drro(viewGroup, layoutInflater, iL, f2 < 0.0f ? this.k : (int) (viewGroup.getMeasuredHeight() / f2), this.p);
                    return drroVar;
                }
                if (i == drpb.a) {
                    view = new View(this.s);
                    int iL2 = L(viewGroup) / this.i;
                    float f3 = this.j;
                    view.setLayoutParams(new ViewGroup.LayoutParams(iL2, f3 < 0.0f ? this.k : (int) (viewGroup.getMeasuredHeight() / f3)));
                } else {
                    ((ekrd) ((ekrd) g.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerCoreBodyAdapter", "onCreateViewHolder", 183, "EmojiPickerCoreBodyAdapter.java")).q("EmojiPickerCoreBodyAdapter gets unsupported view type.");
                    view = new View(this.s);
                    view.setLayoutParams(new ViewGroup.LayoutParams(L(viewGroup) / this.i, this.k));
                }
            }
            drroVar = new drqu(view);
            return drroVar;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public void g(wv wvVar, int i) {
        boolean z;
        int i2 = wvVar.f;
        View view = wvVar.a;
        if (i2 == droz.a) {
            int iA = this.q.a(i);
            String str = ((droz) this.q.get(i)).b;
            if (str.isEmpty()) {
                str = (String) this.h.get(iA);
            }
            if (!str.isEmpty()) {
                drjt.e(view, str);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.category_name);
            if (iA == 0) {
                Context context = this.s;
                ekrg ekrgVar = drmh.a;
                appCompatTextView.setText(context.getString(R.string.emoji_category_recent));
                appCompatTextView.setVisibility(0);
                return;
            }
            if (str.isEmpty()) {
                appCompatTextView.setVisibility(8);
                return;
            } else {
                appCompatTextView.setText(str);
                appCompatTextView.setVisibility(0);
                return;
            }
        }
        if (i2 == drrp.a) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.emoji_picker_empty_category_view);
            String string = ((drrp) this.q.get(i)).c;
            if (string.isEmpty()) {
                string = this.s.getString(l(i) == 0 ? R.string.emoji_empty_recent_category : R.string.emoji_empty_non_recent_category);
            }
            appCompatTextView2.setText(string);
            return;
        }
        if (i2 == drrn.a) {
            drrn drrnVar = (drrn) this.q.get(i);
            drro drroVar = (drro) wvVar;
            int iL = l(i);
            int iG = i - G(iL);
            if (iL != 0) {
                z = false;
            } else if (drrnVar.b(null)) {
                iL = 0;
                z = true;
            } else {
                iL = 0;
                z = false;
            }
            Set set = this.n;
            Integer numValueOf = Integer.valueOf(i);
            boolean z2 = set.contains(numValueOf) || drrnVar.b(this.a) || z;
            if (z2) {
                if (z) {
                    this.m = wvVar.fs();
                }
                this.n.add(numValueOf);
            }
            drst drstVar = new drst(drse.a(drrnVar, iG, iL, F(iL), this.d));
            drstVar.f(z2);
            drroVar.C(drstVar.a(), drrnVar.e);
            if (iL > 0) {
                droa droaVar = this.o;
                String str2 = drrnVar.d;
                if (!droaVar.c(str2).isEmpty()) {
                    this.f.put(droaVar.d(str2), new drqv(iL, i - G(iL)));
                }
            }
            J(view, drrnVar);
        }
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return this.q.get(i).h;
    }

    final int l(int i) {
        return this.q.a(i);
    }
}
