package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drpv extends drqw implements drly {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter");
    private static int t = 0;
    public final Runnable d;
    public final boolean e;
    public int f;
    private final ejxr u;
    private final ejxr v;
    private final Runnable w;
    private final View.OnClickListener x;

    public drpv(Context context, drrl drrlVar, ekgb ekgbVar, drtj drtjVar, droc drocVar, droa droaVar, ejxr ejxrVar, ejxr ejxrVar2, Runnable runnable, Runnable runnable2, View.OnClickListener onClickListener) {
        super(context, drrlVar, ekgbVar, drtjVar, drocVar, droaVar);
        SystemClock.elapsedRealtime();
        this.f = -1;
        ekrd ekrdVar = (ekrd) ((ekrd) a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter", "<init>", 87, "EmojiPickerBodyAdapter.java");
        int i = t + 1;
        t = i;
        ekrdVar.r("EmojiPickerBodyAdapter created (instance count = %s)", i);
        this.e = false;
        this.u = ejxrVar;
        this.v = ejxrVar2;
        this.w = runnable;
        this.d = runnable2;
        this.x = onClickListener;
    }

    @Override // defpackage.drqw, defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        wv wvVarE;
        wv drpuVar;
        plm.a("EmojiPickerBodyAdapter.onCreateViewHolder");
        try {
            if (i == drsc.a) {
                View viewInflate = this.r.inflate(R.layout.loading_placeholder_view, viewGroup, false);
                int iL = L(viewGroup) / this.i;
                float f = this.j;
                viewInflate.setLayoutParams(new ViewGroup.LayoutParams(iL, f < 0.0f ? this.k : (int) (viewGroup.getMeasuredHeight() / f)));
                wvVarE = new drps(viewInflate);
            } else {
                if (i == drsb.a) {
                    drpuVar = new drpt(this.r.inflate(R.layout.loading_category_view_holder, viewGroup, false));
                } else if (i == drrq.a) {
                    drpuVar = new drpu(this.r.inflate(R.layout.error_category_view_holder, viewGroup, false));
                } else if (i == drru.a) {
                    int iL2 = L(viewGroup) / this.i;
                    float f2 = this.j;
                    wvVarE = new drrv(viewGroup, iL2, f2 < 0.0f ? this.k : (int) (viewGroup.getMeasuredHeight() / f2), this.x, this.p);
                } else {
                    wvVarE = super.e(viewGroup, i);
                }
                wvVarE = drpuVar;
            }
            return wvVarE;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.drqw, defpackage.vo
    public final void g(wv wvVar, int i) {
        int i2 = wvVar.f;
        View view = wvVar.a;
        if (i2 != droz.a) {
            if (i2 == drru.a) {
                drru drruVar = (drru) this.q.get(i);
                G(l(i));
                drtl drtlVar = drruVar.b;
                throw null;
            }
            if (i2 == drsb.a) {
                this.w.run();
                return;
            }
            if (i2 != drrq.a) {
                if (i2 == drrn.a) {
                    K(this.f, this.i, view);
                }
                super.g(wvVar, i);
                return;
            } else {
                drrq drrqVar = (drrq) this.q.get(i);
                TextView textView = (TextView) view.findViewById(R.id.error_category_text);
                CharSequence charSequence = drrqVar.b;
                textView.setText((CharSequence) null);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
        }
        int iA = this.q.a(i);
        String str = ((droz) this.q.get(i)).b;
        if (str.isEmpty()) {
            str = (String) this.h.get(iA);
        }
        if (!str.isEmpty()) {
            drjt.e(view, str);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.category_name);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.switch_recent_category_prompt_text);
        if (iA != 0) {
            if (str.isEmpty()) {
                appCompatTextView.setVisibility(8);
            } else {
                appCompatTextView.setText(str);
                appCompatTextView.setVisibility(0);
            }
            appCompatTextView2.setVisibility(8);
            appCompatTextView2.setText((CharSequence) null);
            appCompatTextView2.setOnClickListener(null);
            return;
        }
        ?? r7 = this.u.get();
        if (r7 == 0) {
            Context context = this.s;
            ekrg ekrgVar = drmh.a;
            appCompatTextView.setText(context.getString(R.string.emoji_category_recent));
        } else {
            appCompatTextView.setText((CharSequence) r7);
        }
        appCompatTextView.setVisibility(0);
        Object obj = this.v.get();
        if (obj == null) {
            appCompatTextView2.setVisibility(8);
            appCompatTextView2.setText((CharSequence) null);
            appCompatTextView2.setOnClickListener(null);
        } else {
            ((ekrd) ((ekrd) a.g()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter", "onBindViewHolder", 181, "EmojiPickerBodyAdapter.java")).q("emoji: next category");
            appCompatTextView2.setText(this.s.getString(R.string.recent_category_switch_prompt_text, obj));
            appCompatTextView2.setVisibility(0);
            appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: drpr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.d.run();
                }
            });
        }
    }
}
