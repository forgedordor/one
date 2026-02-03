package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import defpackage.cmb;
import defpackage.cpp;
import defpackage.cqc;
import defpackage.cqd;
import defpackage.crk;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class SignInTemplate implements cpp {
    private final List<Action> mActionList;
    private final ActionStrip mActionStrip;
    private final CarText mAdditionalText;
    private final Action mHeaderAction;
    private final CarText mInstructions;
    private final boolean mIsLoading;
    private final cqd mSignInMethod;
    private final CarText mTitle;

    private SignInTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTitle = null;
        this.mInstructions = null;
        this.mAdditionalText = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mSignInMethod = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInTemplate)) {
            return false;
        }
        SignInTemplate signInTemplate = (SignInTemplate) obj;
        return this.mIsLoading == signInTemplate.mIsLoading && Objects.equals(this.mHeaderAction, signInTemplate.mHeaderAction) && Objects.equals(this.mTitle, signInTemplate.mTitle) && Objects.equals(this.mInstructions, signInTemplate.mInstructions) && Objects.equals(this.mAdditionalText, signInTemplate.mAdditionalText) && Objects.equals(this.mActionStrip, signInTemplate.mActionStrip) && Objects.equals(this.mActionList, signInTemplate.mActionList) && Objects.equals(this.mSignInMethod, signInTemplate.mSignInMethod);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return crk.a(this.mActionList);
    }

    public CarText getAdditionalText() {
        return this.mAdditionalText;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public CarText getInstructions() {
        return this.mInstructions;
    }

    public cqd getSignInMethod() {
        cqd cqdVar = this.mSignInMethod;
        cqdVar.getClass();
        return cqdVar;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTitle, this.mInstructions, this.mAdditionalText, this.mActionStrip, this.mActionList, this.mSignInMethod);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "SignInTemplate";
    }

    SignInTemplate(cqc cqcVar) {
        boolean z = cqcVar.a;
        this.mIsLoading = false;
        Action action = cqcVar.c;
        this.mHeaderAction = null;
        CarText carText = cqcVar.d;
        this.mTitle = null;
        CarText carText2 = cqcVar.e;
        this.mInstructions = null;
        CarText carText3 = cqcVar.f;
        this.mAdditionalText = null;
        ActionStrip actionStrip = cqcVar.g;
        this.mActionStrip = null;
        List list = cqcVar.h;
        this.mActionList = crk.b(null);
        cqd cqdVar = cqcVar.b;
        this.mSignInMethod = null;
    }
}
