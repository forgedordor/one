package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.AnimationBackground;
import androidx.window.extensions.embedding.DividerAttributes;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psk {
    private static final String a;
    private final psi b = new psi(this);
    private final psj c = new psj(this);

    static {
        int i = fdcj.a;
        a = new fdbi(psk.class).c();
        new Binder();
    }

    public static final prw b(ActivityStack activityStack) {
        activityStack.getClass();
        int iD = d();
        if (iD > 0 && iD < 5) {
            return psh.a(activityStack);
        }
        List activities = activityStack.getActivities();
        activities.getClass();
        return new prw(activities, activityStack.isEmpty(), activityStack.getActivityStackToken());
    }

    public static final pwf c(SplitAttributes splitAttributes) {
        pwe pweVarA;
        pwb pwbVar;
        psg psgVarA;
        pwa pwaVar = new pwa();
        SplitAttributes.SplitType splitType = splitAttributes.getSplitType();
        splitType.getClass();
        if (prn$$ExternalSyntheticApiModelOutline0.m$1(splitType)) {
            pweVarA = pwe.c;
        } else if (prn$$ExternalSyntheticApiModelOutline0.m$2(splitType)) {
            pweVarA = pwe.a;
        } else {
            if (!prn$$ExternalSyntheticApiModelOutline0.m$3(splitType)) {
                Objects.toString(splitType);
                throw new IllegalArgumentException("Unknown split type: ".concat(splitType.toString()));
            }
            pwe pweVar = pwe.a;
            pweVarA = pwd.a(prn$$ExternalSyntheticApiModelOutline0.m727m((Object) splitType).getRatio());
        }
        pwaVar.b(pweVarA);
        int layoutDirection = splitAttributes.getLayoutDirection();
        if (layoutDirection == 0) {
            pwbVar = pwb.b;
        } else if (layoutDirection == 1) {
            pwbVar = pwb.c;
        } else if (layoutDirection == 3) {
            pwbVar = pwb.a;
        } else if (layoutDirection == 4) {
            pwbVar = pwb.d;
        } else {
            if (layoutDirection != 5) {
                throw new IllegalArgumentException(a.g(layoutDirection, "Unknown layout direction: "));
            }
            pwbVar = pwb.e;
        }
        pwaVar.a = pwbVar;
        int iD = d();
        if (iD >= 5 && iD < 7) {
            psn psnVar = psn.a;
            pso psoVar = pso.a;
            AnimationBackground animationBackground = splitAttributes.getAnimationBackground();
            animationBackground.getClass();
            pwaVar.b = psp.a(e(animationBackground), psoVar, psoVar, psoVar);
        }
        if (d() >= 7) {
            psn psnVar2 = psn.a;
            AnimationBackground animationBackground2 = splitAttributes.getAnimationParams().getAnimationBackground();
            animationBackground2.getClass();
            pwaVar.b = psp.a(e(animationBackground2), f(splitAttributes.getAnimationParams().getOpenAnimationResId()), f(splitAttributes.getAnimationParams().getCloseAnimationResId()), f(splitAttributes.getAnimationParams().getChangeAnimationResId()));
        }
        if (d() >= 6) {
            DividerAttributes dividerAttributes = splitAttributes.getDividerAttributes();
            new prh().a(6);
            if (dividerAttributes == null) {
                psgVarA = psg.a;
            } else {
                int dividerType = dividerAttributes.getDividerType();
                if (dividerType == 1) {
                    pse pseVar = new pse();
                    pseVar.c(dividerAttributes.getWidthDp());
                    pseVar.b(dividerAttributes.getDividerColor());
                    psgVarA = pseVar.a();
                } else if (dividerType != 2) {
                    Log.w(a, a.h(dividerAttributes, "Unknown divider type ", ".dividerType, default to fixed divider type"));
                    pse pseVar2 = new pse();
                    pseVar2.c(dividerAttributes.getWidthDp());
                    pseVar2.b(dividerAttributes.getDividerColor());
                    psgVarA = pseVar2.a();
                } else {
                    psc pscVar = psc.a;
                    int widthDp = dividerAttributes.getWidthDp();
                    psg psgVar = psg.a;
                    prz.b(widthDp);
                    int dividerColor = dividerAttributes.getDividerColor();
                    prz.a(dividerColor);
                    psgVarA = new psd(widthDp, dividerColor, (dividerAttributes.getPrimaryMinRatio() == -1.0f && dividerAttributes.getPrimaryMaxRatio() == -1.0f) ? psc.a : new psb(dividerAttributes.getPrimaryMinRatio(), dividerAttributes.getPrimaryMaxRatio()), d() >= 7 && dividerAttributes.isDraggingToFullscreenAllowed());
                }
            }
            pwaVar.c = psgVarA;
        }
        return pwaVar.a();
    }

    private static final int d() {
        return new prh().a;
    }

    private static final psn e(AnimationBackground animationBackground) {
        new prh().a(5);
        if (!prn$$ExternalSyntheticApiModelOutline0.m740m((Object) animationBackground)) {
            return psn.a;
        }
        psn psnVar = psn.a;
        return new psl(prn$$ExternalSyntheticApiModelOutline0.m721m((Object) animationBackground).getColor());
    }

    private static final pso f(int i) {
        new prh().a(7);
        return i == 0 ? pso.b : pso.a;
    }

    public final void a(List list) {
        pwh pwhVar;
        pwh pwhVar2;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SplitInfo splitInfoM731m = prn$$ExternalSyntheticApiModelOutline0.m731m(it.next());
            int iD = d();
            if (iD == 1) {
                splitInfoM731m.getClass();
                ActivityStack primaryActivityStack = splitInfoM731m.getPrimaryActivityStack();
                primaryActivityStack.getClass();
                prw prwVarA = psh.a(primaryActivityStack);
                ActivityStack secondaryActivityStack = splitInfoM731m.getSecondaryActivityStack();
                secondaryActivityStack.getClass();
                prw prwVarA2 = psh.a(secondaryActivityStack);
                pwa pwaVar = new pwa();
                pwe pweVar = pwe.a;
                float splitRatio = splitInfoM731m.getSplitRatio();
                pwe pweVarA = pwe.a;
                if (splitRatio != pweVarA.d) {
                    pweVarA = pwd.a(splitRatio);
                }
                pwaVar.b(pweVarA);
                pwaVar.a = pwb.a;
                pwhVar = new pwh(prwVarA, prwVarA2, pwaVar.a());
            } else {
                if (iD == 2) {
                    psi psiVar = this.b;
                    splitInfoM731m.getClass();
                    psk pskVar = psiVar.a;
                    ActivityStack primaryActivityStack2 = splitInfoM731m.getPrimaryActivityStack();
                    primaryActivityStack2.getClass();
                    prw prwVarA3 = psh.a(primaryActivityStack2);
                    ActivityStack secondaryActivityStack2 = splitInfoM731m.getSecondaryActivityStack();
                    secondaryActivityStack2.getClass();
                    prw prwVarA4 = psh.a(secondaryActivityStack2);
                    SplitAttributes splitAttributes = splitInfoM731m.getSplitAttributes();
                    splitAttributes.getClass();
                    pwhVar2 = new pwh(prwVarA3, prwVarA4, c(splitAttributes));
                } else if (iD < 3 || iD >= 5) {
                    ActivityStack primaryActivityStack3 = splitInfoM731m.getPrimaryActivityStack();
                    primaryActivityStack3.getClass();
                    prw prwVarB = b(primaryActivityStack3);
                    ActivityStack secondaryActivityStack3 = splitInfoM731m.getSecondaryActivityStack();
                    secondaryActivityStack3.getClass();
                    prw prwVarB2 = b(secondaryActivityStack3);
                    SplitAttributes splitAttributes2 = splitInfoM731m.getSplitAttributes();
                    splitAttributes2.getClass();
                    pwf pwfVarC = c(splitAttributes2);
                    SplitInfo.Token splitInfoToken = splitInfoM731m.getSplitInfoToken();
                    splitInfoToken.getClass();
                    pwhVar = new pwh(prwVarB, prwVarB2, pwfVarC, null, splitInfoToken);
                } else {
                    psj psjVar = this.c;
                    splitInfoM731m.getClass();
                    psk pskVar2 = psjVar.a;
                    ActivityStack primaryActivityStack4 = splitInfoM731m.getPrimaryActivityStack();
                    primaryActivityStack4.getClass();
                    prw prwVarA5 = psh.a(primaryActivityStack4);
                    ActivityStack secondaryActivityStack4 = splitInfoM731m.getSecondaryActivityStack();
                    secondaryActivityStack4.getClass();
                    prw prwVarA6 = psh.a(secondaryActivityStack4);
                    SplitAttributes splitAttributes3 = splitInfoM731m.getSplitAttributes();
                    splitAttributes3.getClass();
                    pwf pwfVarC2 = c(splitAttributes3);
                    IBinder token = splitInfoM731m.getToken();
                    token.getClass();
                    pwhVar2 = new pwh(prwVarA5, prwVarA6, pwfVarC2, token);
                }
                pwhVar = pwhVar2;
            }
            arrayList.add(pwhVar);
        }
    }
}
