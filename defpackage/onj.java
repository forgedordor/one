package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class onj implements oja {
    private final Context a;
    private final onl b;
    private kw c;
    private ValueAnimator d;

    public onj(Context context, onl onlVar) {
        this.a = context;
        this.b = onlVar;
    }

    @Override // defpackage.oja
    public final void a(ojx ojxVar, Bundle bundle) {
        CharSequence string;
        String strValueOf;
        fcti fctiVar;
        ojxVar.getClass();
        if (ojxVar instanceof olk) {
            return;
        }
        Context context = this.a;
        CharSequence charSequence = ojxVar.f;
        if (charSequence == null) {
            string = null;
        } else {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer = new StringBuffer();
            Map mapF = bundle != null ? pis.f(bundle) : fcvp.a;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (strGroup == null || !mapF.containsKey(strGroup)) {
                    throw new IllegalArgumentException("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"');
                }
                matcher.appendReplacement(stringBuffer, "");
                oil oilVar = (oil) ojxVar.i().get(strGroup);
                okq okqVar = oilVar != null ? oilVar.a : null;
                okq okqVar2 = okq.b;
                if (fdbq.f(okqVar, okqVar2)) {
                    bundle.getClass();
                    strValueOf = context.getString(((Integer) okqVar2.b(bundle, strGroup)).intValue());
                } else {
                    okqVar.getClass();
                    bundle.getClass();
                    strValueOf = String.valueOf(okqVar.b(bundle, strGroup));
                }
                strValueOf.getClass();
                stringBuffer.append(strValueOf);
            }
            matcher.appendTail(stringBuffer);
            string = stringBuffer.toString();
        }
        if (string != null) {
            c(string);
        }
        onl onlVar = this.b;
        Iterator itA = ojv.b(ojxVar).a();
        while (itA.hasNext()) {
            ojx ojxVar2 = (ojx) itA.next();
            if (onlVar.a.contains(Integer.valueOf(ojxVar2.c()))) {
                if (ojxVar2 instanceof oka) {
                    int iC = ojxVar.c();
                    int i = oka.b;
                    if (iC == ojz.b((oka) ojxVar2).c()) {
                    }
                }
                b(null, 0);
                return;
            }
        }
        kw kwVar = this.c;
        if (kwVar != null) {
            fctiVar = new fcti(kwVar, true);
        } else {
            kw kwVar2 = new kw(context);
            this.c = kwVar2;
            fctiVar = new fcti(kwVar2, false);
        }
        Object obj = fctiVar.b;
        kw kwVar3 = (kw) fctiVar.a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b(kwVar3, R.string.nav_app_bar_navigate_up_description);
        if (!zBooleanValue) {
            kwVar3.setProgress(1.0f);
            return;
        }
        float f = kwVar3.a;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(kwVar3, "progress", f, 1.0f);
        this.d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.getClass();
        objectAnimatorOfFloat.start();
    }

    protected abstract void b(Drawable drawable, int i);

    protected abstract void c(CharSequence charSequence);
}
