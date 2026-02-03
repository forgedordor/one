package androidx.car.app.model.signin;

import androidx.car.app.model.CarText;
import defpackage.cmb;
import defpackage.cnv;
import defpackage.cqb;
import defpackage.cqd;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class InputSignInMethod implements cqd {
    public static final int INPUT_TYPE_DEFAULT = 1;
    public static final int INPUT_TYPE_PASSWORD = 2;
    public static final int KEYBOARD_DEFAULT = 1;
    public static final int KEYBOARD_EMAIL = 2;
    public static final int KEYBOARD_NUMBER = 4;
    public static final int KEYBOARD_PHONE = 3;
    private final CarText mDefaultValue;
    private final CarText mErrorMessage;
    private final CarText mHint;
    private final cnv mInputCallbackDelegate;
    private final int mInputType;
    private final int mKeyboardType;
    private final boolean mShowKeyboardByDefault;

    private InputSignInMethod() {
        this.mHint = null;
        this.mDefaultValue = null;
        this.mInputType = 1;
        this.mErrorMessage = null;
        this.mKeyboardType = 1;
        this.mInputCallbackDelegate = null;
        this.mShowKeyboardByDefault = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputSignInMethod)) {
            return false;
        }
        InputSignInMethod inputSignInMethod = (InputSignInMethod) obj;
        return this.mInputType == inputSignInMethod.mInputType && this.mKeyboardType == inputSignInMethod.mKeyboardType && this.mShowKeyboardByDefault == inputSignInMethod.mShowKeyboardByDefault && Objects.equals(this.mHint, inputSignInMethod.mHint) && Objects.equals(this.mDefaultValue, inputSignInMethod.mDefaultValue) && Objects.equals(this.mErrorMessage, inputSignInMethod.mErrorMessage);
    }

    public CarText getDefaultValue() {
        return this.mDefaultValue;
    }

    public CarText getErrorMessage() {
        return this.mErrorMessage;
    }

    public CarText getHint() {
        return this.mHint;
    }

    public cnv getInputCallbackDelegate() {
        cnv cnvVar = this.mInputCallbackDelegate;
        cnvVar.getClass();
        return cnvVar;
    }

    public int getInputType() {
        return this.mInputType;
    }

    public int getKeyboardType() {
        return this.mKeyboardType;
    }

    public int hashCode() {
        return Objects.hash(this.mHint, this.mDefaultValue, Integer.valueOf(this.mInputType), this.mErrorMessage, Integer.valueOf(this.mKeyboardType), Boolean.valueOf(this.mShowKeyboardByDefault));
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        return "[inputType:" + this.mInputType + ", keyboardType: " + this.mKeyboardType + "]";
    }

    InputSignInMethod(cqb cqbVar) {
        CarText carText = cqbVar.b;
        this.mHint = null;
        CarText carText2 = cqbVar.c;
        this.mDefaultValue = null;
        int i = cqbVar.d;
        this.mInputType = 0;
        CarText carText3 = cqbVar.e;
        this.mErrorMessage = null;
        int i2 = cqbVar.f;
        this.mKeyboardType = 0;
        cnv cnvVar = cqbVar.a;
        this.mInputCallbackDelegate = null;
        boolean z = cqbVar.g;
        this.mShowKeyboardByDefault = false;
    }
}
