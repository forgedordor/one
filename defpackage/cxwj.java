package defpackage;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxwj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/debug/cloudstore/DebugCmsUtils");
    public static final ekgp b = ekgp.q("Set deviceId", "testDeviceId", "Set cmsD2DTimestamp", "2024-06-03T04:00:00-08:00", "Set dailyRetrievedCmsTimestamp", "2024-06-03T04:00:00-08:00", "Set PriorToCmsGaiaId", "testPriorToGaiaId", "Set priorToDeviceId", "testDeviceId", "Set cmsOptOutTimestamp", "2024-06-03T04:00:00-08:00");
    public final aurx c;
    public final eosc d;
    public final eosc e;
    public final fcsu f;
    public final axky g;
    public final eigp h;
    public final autx i;

    public cxwj(aurx aurxVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, axky axkyVar, eigp eigpVar, autx autxVar) {
        this.c = aurxVar;
        this.d = eoscVar;
        this.f = fcsuVar;
        this.g = axkyVar;
        this.e = eoscVar2;
        this.h = eigpVar;
        this.i = autxVar;
    }

    public static Spinner a(Context context, List list) {
        ru ruVar = new ru(context);
        ruVar.setAdapter((SpinnerAdapter) new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item, list));
        return ruVar;
    }

    public final void b(cyfv cyfvVar, String str, LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(cyfvVar.a);
        linearLayout2.addView(cyfvVar.b(str));
        linearLayout2.setOrientation(1);
        EditText editTextA = cyfvVar.a(1);
        editTextA.setText((CharSequence) b.get(str));
        editTextA.setMaxLines(1);
        editTextA.setImeOptions(6);
        editTextA.setFocusable(true);
        if ("Set cmsOptOutTimestamp".equals(str)) {
            editTextA.setId(com.google.android.apps.messaging.R.id.debug_menu_set_opt_out_timestamp);
        }
        editTextA.addTextChangedListener(new cxwi(this, str, editTextA));
        linearLayout2.addView(editTextA);
        linearLayout.addView(linearLayout2);
    }

    public final void c(cyfv cyfvVar, String str, LinearLayout linearLayout, cpyb cpybVar) {
        TextView textViewB = cyfvVar.b(str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        textViewB.setTypeface(textViewB.getTypeface(), 1);
        textViewB.setLayoutParams(layoutParams);
        textViewB.setPadding(0, 5, 0, 5);
        linearLayout.addView(textViewB);
        ArrayList arrayList = new ArrayList();
        arrayList.add("Not selected");
        arrayList.add("Off");
        arrayList.add("On");
        Spinner spinnerA = a(cyfvVar.a, arrayList);
        spinnerA.setSelection(0, false);
        linearLayout.addView(spinnerA);
        spinnerA.setOnItemSelectedListener(new eigo(this.h, new cxwa(this, cpybVar), "createEnableSpinner", 232));
    }

    public final void d(cyfv cyfvVar, String str, LinearLayout linearLayout, cpyb cpybVar) {
        TextView textViewB = cyfvVar.b(str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        textViewB.setTypeface(textViewB.getTypeface(), 1);
        textViewB.setLayoutParams(layoutParams);
        textViewB.setPadding(0, 5, 0, 5);
        linearLayout.addView(textViewB);
        ArrayList arrayList = new ArrayList();
        arrayList.add("Not selected");
        arrayList.addAll((Collection) DesugarArrays.stream(auml.values()).map(new Function() { // from class: cxvu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((auml) obj).name();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new cxvt())));
        Spinner spinnerA = a(cyfvVar.a, arrayList);
        linearLayout.addView(spinnerA);
        spinnerA.setSelection(0, false);
        spinnerA.setOnItemSelectedListener(new eigo(this.h, new cxwc(this, cpybVar), "createFeatureEnableStatusSpinner", 297));
    }
}
