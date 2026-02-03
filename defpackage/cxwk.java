package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxwk {
    private static final LinearLayout.LayoutParams d;
    public final cyfv a;
    public final AlertDialog.Builder b;
    public int c;
    private final LinearLayout e;

    static {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        d = layoutParams;
    }

    public cxwk(cyfv cyfvVar, Activity activity) {
        this.a = cyfvVar;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        this.e = linearLayout;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setFillViewport(true);
        scrollView.addView(linearLayout);
        builder.setView(scrollView);
        this.b = builder;
        TextView textViewA = cyfx.a(activity, "Cms Settings Data");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        textViewA.setLayoutParams(layoutParams);
        textViewA.setTypeface(textViewA.getTypeface(), 1);
        b(textViewA);
    }

    public final void a(String str, String str2) {
        str2.getClass();
        int i = this.c + 1;
        this.c = i;
        String str3 = i + ". " + str + ":";
        cyfv cyfvVar = this.a;
        b(cyfvVar.b(str3));
        TextView textViewB = cyfvVar.b(str2);
        textViewB.setLayoutParams(d);
        textViewB.setPadding(0, 5, 0, 10);
        b(textViewB);
    }

    public final void b(View view) {
        this.e.addView(view);
    }
}
