package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxar implements dwwx {
    final /* synthetic */ dxaw a;

    public dxar(dxaw dxawVar) {
        this.a = dxawVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, dwzn] */
    @Override // defpackage.dwwx
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ?? r1;
        dwpf dwpfVar = (dwpf) obj;
        dxaw dxawVar = this.a;
        if (dxawVar.s || !dwpfVar.i().g() || (r1 = dxawVar.a) == 0) {
            return;
        }
        if (dxawVar.t == null) {
            dxawVar.t = new dxdw(r1.getContext());
            dxawVar.u = new dwya(dxawVar.t.a, dwpfVar);
            dxawVar.u.a();
        } else {
            dwya dwyaVar = dxawVar.u;
            if (dwyaVar != null) {
                dwyaVar.b = dwpfVar;
                dwyaVar.a.b(dwpfVar);
            }
        }
        dxawVar.t.b.setText(r1.getResources().getString(R.string.sending_as_format, dwpfVar.i().c()));
        if (!r1.o()) {
            r1.q(dxawVar.t);
        }
        eooq.f(dxawVar.A.b(25), new ejvr() { // from class: dxam
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) throws Resources.NotFoundException {
                if (((Boolean) obj2).booleanValue()) {
                    final dxar dxarVar = this.a;
                    dvhv.a("ConvPresenter", "Adding info icon and tooltip to avatar status bar.");
                    final dxaw dxawVar2 = dxarVar.a;
                    dxdw dxdwVar = dxawVar2.t;
                    View view = dxawVar2.a;
                    String string = view.getResources().getString(R.string.info_icon_content_description);
                    ImageButton imageButton = dxdwVar.d;
                    imageButton.setImageDrawable(ku.a(dxdwVar.getContext(), R.drawable.gs_info_vd_theme_24));
                    dxdwVar.c.setVisibility(8);
                    imageButton.setVisibility(0);
                    imageButton.setContentDescription(string);
                    ImageButton imageButton2 = dxawVar2.t.d;
                    imageButton2.setOnClickListener(new View.OnClickListener() { // from class: dxal
                        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, dwzn] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            dxec dxecVar;
                            dxaw dxawVar3 = dxarVar.a;
                            if (!dxawVar3.a.o() || (dxecVar = dxawVar3.w) == null) {
                                dvhv.a("ConvPresenter", "showInfoIconTooltip: tooltip is null or bottom status bar does not exist.");
                                return;
                            }
                            PopupWindow popupWindow = dxecVar.a.b;
                            if (popupWindow == null || !popupWindow.isShowing()) {
                                dvhv.a("ConvPresenter", "showInfoIconTooltip: Showing InfoIconTooltip");
                                final dxeb dxebVar = dxawVar3.w.a;
                                dxebVar.b.setClippingEnabled(true);
                                dxebVar.b.setAnimationStyle(android.R.style.Animation.Dialog);
                                dxebVar.b.setBackgroundDrawable(new ColorDrawable(0));
                                dxebVar.b.setOutsideTouchable(dxebVar.c);
                                dxebVar.b.setFocusable(true);
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: dxea
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        dxeb dxebVar2 = dxebVar;
                                        View view3 = dxebVar2.f;
                                        Activity activity = null;
                                        if (view3 != null) {
                                            Object objA = dwyh.a(view3.getContext(), fbfm.i());
                                            while (true) {
                                                if (!(objA instanceof Activity)) {
                                                    if (!(objA instanceof ContextWrapper)) {
                                                        break;
                                                    } else {
                                                        objA = ((ContextWrapper) objA).getBaseContext();
                                                    }
                                                } else {
                                                    activity = (Activity) objA;
                                                    break;
                                                }
                                            }
                                        }
                                        if (activity == null || activity.isFinishing()) {
                                            return;
                                        }
                                        dxebVar2.d();
                                        dxebVar2.e();
                                        dxebVar2.b.showAtLocation(dxebVar2.f, 0, dxebVar2.a(), dxebVar2.b());
                                    }
                                });
                                dxba dxbaVar = dxawVar3.e;
                                dxbaVar.b.b(dxbaVar.b(125).a());
                            }
                        }
                    });
                    dvhv.a("ConvPresenter", "Creating infoIconTooltip.");
                    LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(view.getContext()).inflate(R.layout.lt_tooltip_layout, (ViewGroup) null);
                    TextView textView = (TextView) linearLayout.findViewById(R.id.lt_tooltip_content_body);
                    if (fbfm.a.get().w()) {
                        textView.setText(R.string.info_icon_tooltip_body_text_profile_image_shared);
                    } else {
                        textView.setText(R.string.info_icon_tooltip_body_text);
                    }
                    textView.setVisibility(0);
                    MaterialButton materialButton = (MaterialButton) linearLayout.findViewById(R.id.lt_tooltip_content_footer);
                    materialButton.setText(R.string.info_icon_tooltip_footer_text);
                    materialButton.setVisibility(0);
                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: dxab
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            dxaw dxawVar3 = dxawVar2;
                            dxawVar3.d();
                            dxawVar3.c(fbfm.a.get().k());
                            dxba dxbaVar = dxawVar3.e;
                            dxbaVar.b.b(dxbaVar.b(125).a());
                        }
                    });
                    dxawVar2.w = new dxec(linearLayout, imageButton2);
                }
                return null;
            }
        }, dvhw.a());
    }
}
