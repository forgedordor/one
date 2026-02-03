package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecsl extends ecvw {
    public final expq a;
    public final ecqp b;
    public final boolean c;
    public final Integer d;
    public final String e;
    public final exqw f;
    public final int g;
    public final Integer h;
    public final ecpo i;
    public final boolean j;
    public final boolean k;
    public final ecqu l;
    public final Bundle m;

    public ecsl(expq expqVar, ecqp ecqpVar, boolean z, Integer num, String str, exqw exqwVar, int i, Integer num2, ecpo ecpoVar, boolean z2, boolean z3, ecqu ecquVar, Bundle bundle) {
        this.a = expqVar;
        this.b = ecqpVar;
        this.c = z;
        this.d = num;
        this.e = str;
        this.f = exqwVar;
        this.g = i;
        this.h = num2;
        this.i = ecpoVar;
        this.j = z2;
        this.k = z3;
        this.l = ecquVar;
        this.m = bundle;
    }

    @Override // defpackage.ecvw
    public final int a() {
        return this.g;
    }

    @Override // defpackage.ecvw
    public final Bundle b() {
        return this.m;
    }

    @Override // defpackage.ecvw
    public final ecpo c() {
        return this.i;
    }

    @Override // defpackage.ecvw
    public final ecqp d() {
        return this.b;
    }

    @Override // defpackage.ecvw
    public final ecqu e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecvw) {
            ecvw ecvwVar = (ecvw) obj;
            if (this.a.equals(ecvwVar.f()) && this.b.equals(ecvwVar.d()) && this.c == ecvwVar.l()) {
                ecvwVar.n();
                Integer num2 = this.d;
                if (num2 != null ? num2.equals(ecvwVar.i()) : ecvwVar.i() == null) {
                    if (this.e.equals(ecvwVar.j()) && this.f.equals(ecvwVar.g()) && this.g == ecvwVar.a() && ((num = this.h) != null ? num.equals(ecvwVar.h()) : ecvwVar.h() == null) && this.i.equals(ecvwVar.c()) && this.j == ecvwVar.k() && this.k == ecvwVar.m() && this.l.equals(ecvwVar.e()) && this.m.equals(ecvwVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ecvw
    public final expq f() {
        return this.a;
    }

    @Override // defpackage.ecvw
    public final exqw g() {
        return this.f;
    }

    @Override // defpackage.ecvw
    public final Integer h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Integer num = this.d;
        int iHashCode2 = ((((((((((((iHashCode * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003;
        Integer num2 = this.h;
        return ((((((((((iHashCode2 ^ (num2 != null ? num2.hashCode() : 0)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode();
    }

    @Override // defpackage.ecvw
    public final Integer i() {
        return this.d;
    }

    @Override // defpackage.ecvw
    public final String j() {
        return this.e;
    }

    @Override // defpackage.ecvw
    public final boolean k() {
        return this.j;
    }

    @Override // defpackage.ecvw
    public final boolean l() {
        return this.c;
    }

    @Override // defpackage.ecvw
    public final boolean m() {
        return this.k;
    }

    public final String toString() {
        Bundle bundle = this.m;
        ecqu ecquVar = this.l;
        ecpo ecpoVar = this.i;
        exqw exqwVar = this.f;
        ecqp ecqpVar = this.b;
        return "SurveyQuestionsContainerViewArgs{surveyPayload=" + this.a.toString() + ", answer=" + ecqpVar.toString() + ", isSubmitting=" + this.c + ", ignoreFirstQuestion=false, logoResId=" + this.d + ", triggerId=" + this.e + ", surveySession=" + exqwVar.toString() + ", startingQuestionIndex=" + this.g + ", currentItem=" + this.h + ", surveyCompletionStyle=" + ecpoVar.toString() + ", hideCloseButton=" + this.j + ", keepNextButtonForLastQuestion=" + this.k + ", surveyStyle=" + ecquVar.toString() + ", singleSelectOrdinalAnswerMappings=" + bundle.toString() + "}";
    }

    @Override // defpackage.ecvw
    public final void n() {
    }
}
