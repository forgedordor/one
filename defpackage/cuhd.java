package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuhd {
    private final fcsu a;
    private final Optional b;
    private final fcsu c;
    private final fcsu d;
    private final Map e;

    public cuhd(fcsu fcsuVar, Optional optional, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = optional;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcwa.g(new fcti(cuhe.a, Integer.valueOf(R.style.Theme_AppCompat_Translucent_NoTitleBar)), new fcti(cuhe.b, Integer.valueOf(R.style.BugleBaseTheme_NoActionBar)), new fcti(cuhe.c, Integer.valueOf(R.style.BugleTheme)), new fcti(cuhe.d, Integer.valueOf(R.style.BugleCameraActivityTheme)), new fcti(cuhe.e, Integer.valueOf(R.style.BugleTheme_ConversationActivity)), new fcti(cuhe.f, Integer.valueOf(R.style.BugleTheme_ContactDetails)), new fcti(cuhe.g, Integer.valueOf(R.style.BugleTheme_DiagnosticsActivity)), new fcti(cuhe.h, Integer.valueOf(R.style.BugleTheme_DialogActivity)), new fcti(cuhe.i, Integer.valueOf(R.style.Invisible)), new fcti(cuhe.k, Integer.valueOf(R.style.BugleTheme_MessageDetails)), new fcti(cuhe.j, Integer.valueOf(R.style.MediaViewerActivityTheme)), new fcti(cuhe.l, Integer.valueOf(R.style.BugleTheme_SettingsActivity)), new fcti(cuhe.m, Integer.valueOf(R.style.BugleTheme_SwipeActionSettingsActivity)), new fcti(cuhe.n, Integer.valueOf(R.style.BugleTheme_ToolbarSettingsActivity)), new fcti(cuhe.o, Integer.valueOf(R.style.BugleToolbarTheme)), new fcti(cuhe.p, Integer.valueOf(R.style.InvisibleWithNoTitle)), new fcti(cuhe.q, Integer.valueOf(R.style.Theme_GoogleMaterial3_DayNight_NoActionBar)));
    }

    public final void a(final Activity activity, cuhe cuheVar) {
        int iIntValue;
        cuheVar.getClass();
        if (((asgn) this.c.b()).a()) {
            Optional optional = this.b;
            optional.isPresent();
            Object obj = optional.get();
            fcti[] fctiVarArr = new fcti[17];
            cuhe cuheVar2 = cuhe.b;
            Integer numValueOf = Integer.valueOf(R.style.Theme_GoogleMaterial3Expressive_DayNight_NoActionBar);
            fctiVarArr[0] = new fcti(cuheVar2, numValueOf);
            cuhe cuheVar3 = cuhe.a;
            Integer numValueOf2 = Integer.valueOf(R.style.Theme_AppCompat_Translucent_NoTitleBar);
            fctiVarArr[1] = new fcti(cuheVar3, numValueOf2);
            fctiVarArr[2] = new fcti(cuhe.c, Integer.valueOf(R.style.Theme_BugleCoolRanch_DayNight_ActionBar));
            fctiVarArr[3] = new fcti(cuhe.d, Integer.valueOf(R.style.Theme_BugleCoolRanch_Camera_DayNight_NoActionBar));
            fctiVarArr[4] = new fcti(cuhe.e, Integer.valueOf(R.style.Theme_BugleCoolRanch_Conversation_DayNight_NoActionBar));
            fctiVarArr[5] = new fcti(cuhe.f, numValueOf);
            cuhe cuheVar4 = cuhe.g;
            Integer numValueOf3 = Integer.valueOf(R.style.Theme_BugleCoolRanch_DayNight_NoActionBar);
            fctiVarArr[6] = new fcti(cuheVar4, numValueOf3);
            fctiVarArr[7] = new fcti(cuhe.h, Integer.valueOf(R.style.Theme_BugleCoolRanch_Dialog_DayNight_ActionBar));
            fctiVarArr[8] = new fcti(cuhe.i, Integer.valueOf(R.style.Theme_BugleCoolRanch_Invisible));
            fctiVarArr[9] = new fcti(cuhe.j, numValueOf3);
            fctiVarArr[10] = new fcti(cuhe.k, numValueOf);
            fctiVarArr[11] = new fcti(cuhe.o, numValueOf3);
            fctiVarArr[12] = new fcti(cuhe.l, Integer.valueOf(R.style.Theme_BugleCoolRanch_Settings_DayNight_ActionBar));
            fctiVarArr[13] = new fcti(cuhe.m, Integer.valueOf(R.style.Theme_BugleCoolRanch_SettingsSwipe_DayNight_NoActionBar));
            fctiVarArr[14] = new fcti(cuhe.n, Integer.valueOf(true != ((asgx) ((cuhq) obj).a.b()).a() ? R.style.Theme_BugleCoolRanch_Settings_DayNight_NoActionBar : R.style.Theme_BugleCoolRanch3_Settings_DayNight_NoActionBar));
            fctiVarArr[15] = new fcti(cuhe.p, numValueOf2);
            fctiVarArr[16] = new fcti(cuhe.q, numValueOf);
            Integer num = (Integer) fcwa.g(fctiVarArr).get(cuheVar);
            if (num == null) {
                Objects.toString(cuheVar);
                throw new IllegalArgumentException("Unknown theme choice: ".concat(cuheVar.toString()));
            }
            iIntValue = num.intValue();
        } else {
            Integer num2 = (Integer) this.e.get(cuheVar);
            if (num2 == null) {
                Objects.toString(cuheVar);
                throw new IllegalArgumentException("Unknown theme choice: ".concat(cuheVar.toString()));
            }
            iIntValue = num2.intValue();
        }
        activity.getTheme().applyStyle(iIntValue, true);
        Optional optionalA = ((cuhf) this.a.b()).a();
        final fdap fdapVar = new fdap() { // from class: cuhb
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                Integer num3 = (Integer) obj2;
                num3.getClass();
                activity.getTheme().applyStyle(num3.intValue(), true);
                return fctx.a;
            }
        };
        optionalA.ifPresent(new Consumer() { // from class: cuhc
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                fdapVar.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
