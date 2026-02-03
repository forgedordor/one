package defpackage;

import android.util.AttributeSet;
import android.view.View;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.UUID;
import org.bouncycastle.asn1.ASN1Sequence;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class a {
    public static /* synthetic */ String A(long j, String str, String str2) {
        return str + j + str2;
    }

    public static /* synthetic */ String B(int i, String str, String str2, String str3) {
        return str2 + str + str3 + i;
    }

    public static /* synthetic */ String C(String str, String str2, String str3, String str4, String str5) {
        return str + str3 + str2 + str4 + str5;
    }

    public static /* synthetic */ String D(int i, String str) {
        return i + str;
    }

    public static /* synthetic */ String E(Object obj, String str) {
        return str + String.valueOf(obj);
    }

    public static /* synthetic */ String F(long j, long j2, String str, String str2) {
        return str + j2 + str2 + j;
    }

    public static /* synthetic */ String G(String str, Object obj, String str2, String str3) {
        return str2 + str + str3 + obj.toString();
    }

    public static /* synthetic */ String H(Object obj, Object obj2, String str, String str2) {
        return str + String.valueOf(obj2) + str2 + String.valueOf(obj);
    }

    public static /* synthetic */ String I(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    public static /* synthetic */ String J(Object obj, String str) {
        return str + obj.toString();
    }

    public static /* synthetic */ String K(char c, String str, String str2) {
        return str + c + str2;
    }

    public static /* synthetic */ String L(Object obj, Class cls, String str) {
        return str + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(obj.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public static /* synthetic */ String M(ea eaVar, Class cls) {
        return "Attempt to inject a Fragment wrapper of type " + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(eaVar.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public static /* synthetic */ String O(View view) {
        return "TikTok View " + view.getClass().toString() + ", cannot be attached to a non-TikTok Fragment";
    }

    public static /* synthetic */ String R(Class cls, String str, String str2) {
        return str + cls.getName() + str2;
    }

    public static /* synthetic */ String S(pim pimVar, pim pimVar2, String str) {
        return str + pip.b(pimVar2) + "\n Found:\n" + pip.b(pimVar);
    }

    public static /* synthetic */ String T(eqsg eqsgVar) {
        return "Cannot get output prefix for key of class " + eqsgVar.getClass().getName() + " with parameters " + String.valueOf(eqsgVar.a());
    }

    public static /* synthetic */ String U(ermy ermyVar, String str) {
        return str + ermyVar.a();
    }

    public static /* synthetic */ String V(String str, etdb etdbVar, String str2, String str3) {
        return str2 + str + str3 + etdbVar.f();
    }

    public static /* synthetic */ String W(ASN1Sequence aSN1Sequence) {
        return "Bad sequence size: " + aSN1Sequence.e();
    }

    public static /* synthetic */ String X(KeySpec keySpec, String str) {
        return str + String.valueOf(keySpec.getClass()) + ".";
    }

    public static /* synthetic */ String Y(Key key, String str) {
        return str + String.valueOf(key.getClass()) + ".";
    }

    public static /* synthetic */ String a(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ String b(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String c(Object obj, Object obj2, String str, String str2) {
        return str + obj2.toString() + str2 + obj.toString();
    }

    public static /* synthetic */ String d(String str, String str2, String str3, String str4, String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    public static /* synthetic */ String e(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String f(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static /* synthetic */ String g(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String h(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String i(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ String j(Object obj, Object obj2, String str, String str2, String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ String k(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String l(Object obj, String str) {
        return str + obj;
    }

    public static /* synthetic */ String m(Object obj, String str, String str2, String str3) {
        return str2 + str + str3 + obj;
    }

    public static /* synthetic */ String n(String str, String str2, String str3, String str4) {
        return str3 + str2 + str4 + str;
    }

    public static /* synthetic */ String p(Object obj, Object obj2, String str, String str2) {
        return str + String.valueOf(obj) + str2 + obj2.toString();
    }

    public static /* synthetic */ String q(String str, String str2, String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ String r(boolean z, String str) {
        return str + z;
    }

    public static /* synthetic */ String s(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String t(Object obj, Object obj2, Object obj3, String str, String str2, String str3) {
        return str + obj3 + str2 + obj2 + str3 + obj;
    }

    public static /* synthetic */ String u(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ String v(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ String w(Class cls) {
        return cls.getCanonicalName() + "-" + UUID.randomUUID();
    }

    public static /* synthetic */ String x(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String y(Object obj, int i, String str, String str2) {
        return str + i + str2 + obj;
    }

    public static /* synthetic */ String z(int i, int i2, String str, String str2, String str3) {
        return str + i2 + str2 + i + str3;
    }
}
