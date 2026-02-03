package defpackage;

import j$.util.Objects;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eldy extends eldz {
    private volatile eldz a;
    public final eldu b;
    public final Character c;
    public volatile eldz d;

    public eldy(eldu elduVar, Character ch) {
        this.b = elduVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            byte[] bArr = elduVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        ejwl.f(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.eldz
    public int a(byte[] bArr, CharSequence charSequence) throws eldx {
        int i;
        CharSequence charSequenceH = h(charSequence);
        int length = charSequenceH.length();
        eldu elduVar = this.b;
        if (!elduVar.f(length)) {
            throw new eldx("Invalid input length " + charSequenceH.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceH.length()) {
            long jB = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = elduVar.e;
                if (i4 >= i) {
                    break;
                }
                jB <<= elduVar.d;
                if (i2 + i4 < charSequenceH.length()) {
                    jB |= elduVar.b(charSequenceH.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = elduVar.f;
            int i7 = i5 * elduVar.d;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((jB >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    public eldz b(eldu elduVar, Character ch) {
        return new eldy(elduVar, ch);
    }

    @Override // defpackage.eldz
    public void c(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        ejwl.k(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.f;
            i(appendable, bArr, i2, Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    @Override // defpackage.eldz
    public final int d(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.eldz
    public final int e(int i) {
        eldu elduVar = this.b;
        return elduVar.e * eoln.b(i, elduVar.f, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eldy) {
            eldy eldyVar = (eldy) obj;
            if (this.b.equals(eldyVar.b) && Objects.equals(this.c, eldyVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eldz
    public final eldz f() {
        eldu elduVar;
        eldz eldzVarB = this.a;
        if (eldzVarB == null) {
            eldu elduVar2 = this.b;
            if (elduVar2.e()) {
                ejwl.m(!elduVar2.d(), "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr = elduVar2.b;
                char[] cArr2 = new char[cArr.length];
                for (int i = 0; i < cArr.length; i++) {
                    cArr2[i] = ejuf.a(cArr[i]);
                }
                elduVar = new eldu(elduVar2.a.concat(".lowerCase()"), cArr2);
                if (elduVar2.h) {
                    elduVar = elduVar.c();
                }
            } else {
                elduVar = elduVar2;
            }
            eldzVarB = elduVar == elduVar2 ? this : b(elduVar, this.c);
            this.a = eldzVarB;
        }
        return eldzVarB;
    }

    @Override // defpackage.eldz
    public final eldz g() {
        return this.c == null ? this : b(this.b, null);
    }

    @Override // defpackage.eldz
    public final CharSequence h(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        Character ch = this.c;
        return Objects.hashCode(ch) ^ this.b.hashCode();
    }

    final void i(Appendable appendable, byte[] bArr, int i, int i2) {
        ejwl.k(i, i + i2, bArr.length);
        eldu elduVar = this.b;
        int i3 = elduVar.f;
        int i4 = 0;
        ejwl.a(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        while (i4 < i2 * 8) {
            int i7 = elduVar.d;
            appendable.append(elduVar.a(elduVar.c & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        Character ch = this.c;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append('=');
                i4 += elduVar.d;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        eldu elduVar = this.b;
        sb.append(elduVar);
        if (8 % elduVar.d != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public eldy(String str, String str2, Character ch) {
        this(new eldu(str, str2.toCharArray()), ch);
    }
}
