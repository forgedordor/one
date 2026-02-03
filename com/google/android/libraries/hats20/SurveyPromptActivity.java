package com.google.android.libraries.hats20;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.SurveyViewPager;
import defpackage.drho;
import defpackage.drhq;
import defpackage.drhs;
import defpackage.drhw;
import defpackage.drih;
import defpackage.drij;
import defpackage.drin;
import defpackage.driv;
import defpackage.driw;
import defpackage.drix;
import defpackage.drjg;
import defpackage.ea;
import defpackage.erwr;
import defpackage.erwu;
import defpackage.erwy;
import defpackage.erxc;
import defpackage.erxe;
import defpackage.etdh;
import defpackage.etdj;
import defpackage.etdk;
import defpackage.etdl;
import defpackage.evpz;
import defpackage.evsn;
import defpackage.evsx;
import defpackage.evtg;
import defpackage.iy;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SurveyPromptActivity extends iy implements drin, driw, driv {
    private drhs A;
    private LinearLayout B;
    private TextView C;
    private TextView D;
    private int E;
    private drjg F;
    private boolean G;
    private int I;
    private boolean J;
    public FrameLayout n;
    public LinearLayout o;
    public boolean q;
    private drih s;
    private RectF t;
    private etdh u;
    private erxe v;
    private String w;
    private SurveyViewPager y;
    private drhq z;
    private final Point r = new Point(0, 0);
    private int x = 0;
    public String p = "";
    private final Handler H = new Handler();

    public static void H(Activity activity, String str, etdh etdhVar, erxe erxeVar, drhq drhqVar, Integer num, boolean z, boolean z2, int i) {
        Intent intent = new Intent();
        intent.setClassName(activity, "com.google.android.libraries.hats20.SurveyPromptActivity");
        intent.putExtra("SiteId", str);
        intent.putExtra("Survey", etdhVar.toByteArray());
        intent.putExtra("SurveyPayload", erxeVar.toByteArray());
        intent.putExtra("AnswerBeacon", drhqVar);
        intent.putExtra("IsFullWidth", z);
        intent.putExtra("IgnoreFirstQuestion", z2);
        intent.putExtra("PromplessRatingLogo", i);
        Log.d("HatsLibSurveyActivity", String.format("Starting survey for client activity: %s", activity.getClass().getCanonicalName()));
        if (num == null) {
            activity.startActivity(intent);
        } else {
            activity.startActivityForResult(intent, num.intValue());
        }
    }

    private final int I() {
        SurveyViewPager surveyViewPager = this.y;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = surveyViewPager.c;
        return this.J ? i + 1 : i;
    }

    private final String J() {
        etdh etdhVar = this.u;
        if ((etdhVar.b & 256) != 0) {
            if (Patterns.WEB_URL.matcher(etdhVar.j.toLowerCase()).matches() && (URLUtil.isHttpUrl(this.u.j) || URLUtil.isHttpsUrl(this.u.j))) {
                Uri uri = Uri.parse(this.u.j);
                try {
                    return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery() != null ? URLEncoder.encode(uri.getQuery(), "utf-8") : "").toString();
                } catch (UnsupportedEncodingException | URISyntaxException e) {
                    Log.e("HatsLibSurveyActivity", e.getMessage());
                }
            }
        }
        return "";
    }

    private final void K() {
        this.y.v().Q.sendAccessibilityEvent(32);
    }

    private final void L(boolean z) {
        Button button = (Button) findViewById(R.id.hats_lib_next);
        if (button == null || button.isEnabled() == z) {
            return;
        }
        button.setAlpha(true != z ? 0.3f : 1.0f);
        button.setEnabled(z);
    }

    private final void M(boolean z) {
        TextView textView = this.C;
        textView.announceForAccessibility(textView.getContentDescription());
        ViewPropertyAnimator duration = this.C.animate().alpha(1.0f).setDuration(350L);
        long j = true != z ? 0 : 700;
        duration.setStartDelay(j);
        this.C.setVisibility(0);
        if (this.p.isEmpty()) {
            drhw.c().b().a = true;
            this.H.postDelayed(new drho(this), 2400L);
        } else {
            this.D.animate().alpha(1.0f).setDuration(350L).setStartDelay(j);
            this.D.setVisibility(0);
        }
    }

    private final void N() {
        Button button = (Button) findViewById(R.id.hats_lib_next);
        if (button == null || !this.y.x()) {
            return;
        }
        button.setText(R.string.hats_lib_submit);
    }

    private final void O() throws Resources.NotFoundException {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.n.getLayoutParams();
        int iB = drij.a(this).x;
        int i = drij.a(this).y;
        Resources resources = getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = (i - (identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0)) - Math.round(this.t.top + this.t.bottom);
        if (!this.G) {
            iB = this.s.b();
        }
        Point point = new Point(iB, Math.min(dimensionPixelSize, this.r.y));
        layoutParams.width = point.x - Math.round(this.t.left + this.t.right);
        layoutParams.height = point.y > 0 ? point.y : this.E;
        this.n.setAlpha(1.0f);
        layoutParams.setMargins(Math.round(this.t.left), Math.round(this.t.top), Math.round(this.t.right), Math.round(this.t.bottom));
        this.n.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean Q(int i) {
        if (i >= this.v.b.size()) {
            return false;
        }
        erwu erwuVar = (erwu) this.v.b.get(i);
        ArrayList<String> arrayList = new ArrayList();
        int iB = erxc.b(erwuVar.d);
        if (iB == 0) {
            iB = 1;
        }
        int i2 = iB - 2;
        if (i2 == 1 || i2 == 2) {
            for (erwr erwrVar : erwuVar.e) {
                if (erwrVar.c == 0) {
                    arrayList.add(erwrVar.b);
                }
            }
        } else if (i2 == 4) {
            erwy erwyVar = erwuVar.f;
            if (erwyVar == null) {
                erwyVar = erwy.a;
            }
            evsx evsxVar = erwyVar.d;
            int i3 = 0;
            while (i3 < evsxVar.size()) {
                int i4 = i3 + 1;
                if (((Integer) evsxVar.get(i3)).intValue() == 0) {
                    arrayList.add(String.valueOf(i4));
                }
                i3 = i4;
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        evtg evtgVar = ((etdj) this.z.b.get(i)).d;
        for (String str : arrayList) {
            Iterator<E> it = evtgVar.iterator();
            while (it.hasNext()) {
                if (str.equals((String) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.drin
    public final Point B() {
        Point pointA = drij.a(this);
        pointA.x = Math.min(pointA.x, this.s.b() - Math.round(this.t.left + this.t.right));
        return new Point(View.MeasureSpec.makeMeasureSpec(pointA.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(pointA.y, Integer.MIN_VALUE));
    }

    public final void C() {
        SurveyViewPager surveyViewPager = this.y;
        if (surveyViewPager == null || !(surveyViewPager.v() instanceof drix)) {
            return;
        }
        drix drixVar = (drix) this.y.v();
        ((InputMethodManager) drixVar.G().getSystemService("input_method")).hideSoftInputFromWindow(drixVar.d.getWindowToken(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017d A[SYNTHETIC] */
    @Override // defpackage.driv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.hats20.SurveyPromptActivity.D():void");
    }

    @Override // defpackage.drin
    public final void E(int i, int i2) throws Resources.NotFoundException {
        this.x++;
        Point point = this.r;
        point.x = Math.max(point.x, i);
        point.y = Math.max(point.y, i2);
        if (this.x == this.F.j()) {
            this.x = 0;
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.hats_lib_survey_controls_container);
            if (frameLayout != null) {
                point.y += frameLayout.getMeasuredHeight();
            }
            this.y.w();
            if (this.z.a.getString("t") == null) {
                G("sv");
            }
            O();
            Window window = getWindow();
            window.addFlags(2);
            window.clearFlags(32);
            window.addFlags(262144);
            window.setDimAmount(0.4f);
            if (this.s.a.getResources().getBoolean(R.bool.hats_lib_survey_should_display_close_button)) {
                findViewById(R.id.hats_lib_close_button).setVisibility(0);
            }
            K();
        }
    }

    @Override // defpackage.driw
    public final void F(boolean z, ea eaVar) {
        if (drjg.m(eaVar) == this.y.c) {
            L(z);
        }
    }

    public final void G(String str) {
        this.z.c(str);
        this.A.a(this.z);
    }

    @Override // android.app.Activity
    public final void finish() {
        if (getCallingActivity() != null) {
            etdk etdkVar = (etdk) etdl.a.createBuilder();
            etdh etdhVar = this.u;
            etdkVar.copyOnWrite();
            etdl etdlVar = (etdl) etdkVar.instance;
            etdhVar.getClass();
            etdlVar.d = etdhVar;
            etdlVar.b |= 2;
            List list = this.z.b;
            etdkVar.copyOnWrite();
            etdl etdlVar2 = (etdl) etdkVar.instance;
            evtg evtgVar = etdlVar2.e;
            if (!evtgVar.c()) {
                etdlVar2.e = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(list, etdlVar2.e);
            int i = true == "a".equals(this.z.a.getString("t")) ? 1 : 2;
            etdkVar.copyOnWrite();
            etdl etdlVar3 = (etdl) etdkVar.instance;
            etdlVar3.c = i;
            etdlVar3.b = 1 | etdlVar3.b;
            setResult(-1, new Intent().putExtra("ExtraResultSurveyResponse", ((etdl) etdkVar.build()).toByteArray()).putExtra("ExtraResultAnswerBeaconString", this.z.a(false).getQuery()));
        }
        super.finish();
    }

    @Override // defpackage.abi, android.app.Activity
    public final void onBackPressed() {
        G("o");
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01db  */
    @Override // defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onCreate(android.os.Bundle r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.hats20.SurveyPromptActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            drhw.c().a().a();
        }
        this.H.removeCallbacks(null);
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onPostResume() {
        super.onPostResume();
        if (this.q && this.p.isEmpty()) {
            finish();
        }
    }

    @Override // defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("CurrentQuestionIndex", I());
        bundle.putBoolean("IsSubmitting", this.q);
        bundle.putParcelable("AnswerBeacon", this.z);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            this.n.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && this.q) {
                Log.d("HatsLibSurveyActivity", "User clicked outside of survey root container when showing thank-you page. Closing.");
                finish();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
