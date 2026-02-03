package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exui {
    public final HashMap a = new HashMap();
    public final exug b;
    public final KeyPair c;
    public byte[] d;
    public byte[] e;
    public int f;
    private PublicKey g;
    private SecretKey h;
    private byte[] i;

    public exui(exug exugVar) throws exue {
        if (exugVar == null) {
            n("Invalid handshake cipher");
        }
        this.b = exugVar;
        this.f = 4;
        if (exugVar.ordinal() == 0) {
            this.c = exvc.b();
        } else {
            k("unknown cipher: ".concat(String.valueOf(String.valueOf(exugVar))));
            throw new AssertionError();
        }
    }

    public static byte[] e() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private final PublicKey i(byte[] bArr) throws InvalidKeySpecException, exuf, exue {
        try {
            exvi exviVar = (exvi) evsn.parseFrom(exvi.a, bArr);
            int i = exviVar.b;
            if ((i & 1) == 0) {
                throw new InvalidKeySpecException("GenericPublicKey.type is a required field");
            }
            int iA = exvk.a(exviVar.c);
            int i2 = 1;
            if (iA == 0 || iA == 1) {
                if ((i & 2) != 0) {
                    exvg exvgVar = exviVar.d;
                    if (exvgVar == null) {
                        exvgVar = exvg.a;
                    }
                    return exvc.c(exvgVar);
                }
            } else if (iA != 2) {
                if ((i & 8) != 0) {
                    exve exveVar = exviVar.f;
                    if (exveVar == null) {
                        exveVar = exve.a;
                    }
                    return exvc.e(exveVar);
                }
            } else if ((i & 4) != 0) {
                exvm exvmVar = exviVar.e;
                if (exvmVar == null) {
                    exvmVar = exvm.a;
                }
                return exvc.d(exvmVar);
            }
            int iA2 = exvk.a(exviVar.c);
            if (iA2 != 0) {
                i2 = iA2;
            }
            throw new InvalidKeySpecException("key object is missing for key type: ".concat(Integer.toString(i2)));
        } catch (evtj | InvalidKeySpecException e) {
            o(104, "Cannot parse public key: ".concat(String.valueOf(e.getMessage())));
            throw new AssertionError();
        }
    }

    private final void j(Exception exc) throws exue {
        this.f = 11;
        throw new exue(exc);
    }

    private final void k(String str) throws exue {
        this.f = 11;
        throw new exue(str);
    }

    private final void l(String str, Exception exc) throws exue {
        this.f = 11;
        throw new exue(str, exc);
    }

    private final void m(exuy exuyVar) throws exue {
        exum exumVar;
        if ((exuyVar.b & 2) != 0) {
            try {
                exumVar = (exum) evsn.parseFrom(exum.a, exuyVar.d);
            } catch (evtj e) {
                l("Cannot parse alert message", e);
                exumVar = null;
            }
            int i = exumVar.b;
            if ((i & 1) != 0) {
                if ((i & 2) != 0) {
                    int iA = exuk.a(exumVar.c);
                    k("Received Alert message. Type: " + Integer.toString(iA != 0 ? iA : 1) + " Error Message: " + exumVar.d);
                } else {
                    int iA2 = exuk.a(exumVar.c);
                    k("Received Alert message. Type: ".concat(Integer.toString(iA2 != 0 ? iA2 : 1)));
                }
            }
        }
        k("Received empty Alert Message");
    }

    private final void n(String str) {
        this.f = 11;
        throw new IllegalArgumentException(str);
    }

    private final void o(int i, String str) throws exuf, exue {
        this.f = 11;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            switch (i) {
                case VCardConstants.DEFAULT_PREF /* 100 */:
                case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                case 102:
                case 103:
                case 104:
                    break;
                default:
                    k("Unknown alert type: ".concat(Integer.toString(i)));
                    break;
            }
        }
        exul exulVar = (exul) exum.a.createBuilder();
        exulVar.copyOnWrite();
        exum exumVar = (exum) exulVar.instance;
        exumVar.c = i;
        exumVar.b |= 1;
        exulVar.copyOnWrite();
        exum exumVar2 = (exum) exulVar.instance;
        exumVar2.b = 2 | exumVar2.b;
        exumVar2.d = str;
        throw new exuf(str, (exum) exulVar.build());
    }

    public final exua a() {
        byte[] bytes;
        SecretKeySpec secretKeySpec;
        Exception e;
        SecretKey secretKeyA;
        int i = this.f;
        int i2 = i - 1;
        SecretKey secretKeyA2 = null;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 6:
                c("Handshake not verified, cannot create context");
                throw new AssertionError();
            case 7:
            default:
                c("Handshake is not complete; cannot create connection context");
                break;
            case 8:
                break;
            case 9:
                c("Cannot reuse handshake context; is has already been used");
                throw new AssertionError();
            case 10:
                c("Cannot make context; handshake had error");
                throw new AssertionError();
        }
        if (this.h == null) {
            c("Unexpected state error: derived key is null");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.d);
            byteArrayOutputStream.write(this.e);
        } catch (IOException e2) {
            j(e2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            bytes = "UKEY2 v1 next".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e3) {
            j(e3);
            bytes = null;
        }
        try {
            secretKeySpec = new SecretKeySpec(exvb.a(this.h, bytes, byteArray), "AES");
        } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
            j(e4);
            secretKeySpec = null;
        }
        try {
            secretKeyA = exuc.a(secretKeySpec, "client");
            try {
                secretKeyA2 = exuc.a(secretKeySpec, "server");
            } catch (InvalidKeyException e5) {
                e = e5;
                j(e);
                this.f = 10;
                return new exub(secretKeyA2, secretKeyA);
            } catch (NoSuchAlgorithmException e6) {
                e = e6;
                j(e);
                this.f = 10;
                return new exub(secretKeyA2, secretKeyA);
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e7) {
            e = e7;
            secretKeyA = null;
        }
        this.f = 10;
        return new exub(secretKeyA2, secretKeyA);
    }

    public final void b(byte[] bArr) {
        exuy exuyVar;
        exva exvaVar;
        exuy exuyVar2;
        int iA;
        exuy exuyVar3;
        byte[] bArrF;
        int i = this.f;
        int i2 = i - 1;
        exug exugVar = null;
        exuo exuoVar = null;
        exus exusVar = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            try {
                exuyVar = (exuy) evsn.parseFrom(exuy.a, bArr);
            } catch (evtj e) {
                o(1, "Can't parse message 2 ".concat(String.valueOf(e.getMessage())));
                exuyVar = null;
            }
            if ((exuyVar.b & 1) == 0) {
                o(2, "Expected, but did not find message type");
            }
            int iA2 = exux.a(exuyVar.c);
            if (iA2 != 0 && iA2 == 2) {
                this.f = 11;
                m(exuyVar);
            }
            int iA3 = exux.a(exuyVar.c);
            if (iA3 == 0 || iA3 != 4) {
                o(2, "Expected, but did not find SERVER_INIT message type");
            }
            if ((exuyVar.b & 2) == 0) {
                o(4, "Expected message data, but didn't find it");
            }
            try {
                exvaVar = (exva) evsn.parseFrom(exva.a, exuyVar.d);
            } catch (evtj unused) {
                o(4, "Can't parse message data into ServerInit");
                exvaVar = null;
            }
            if ((exvaVar.b & 1) == 0) {
                o(100, "ServerInit missing version");
            }
            if (exvaVar.c != 1) {
                o(100, "ServerInit version mismatch");
            }
            if ((exvaVar.b & 2) == 0) {
                o(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ServerInit missing random");
            }
            if (exvaVar.d.I().length != 32) {
                o(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ServerInit has incorrect nonce length");
            }
            if ((exvaVar.b & 4) == 0) {
                o(102, "No handshake cipher found");
            }
            exug[] exugVarArrValues = exug.values();
            int length = exugVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                exug exugVar2 = exugVarArrValues[i3];
                int i4 = exugVar2.b;
                int iA4 = exuu.a(exvaVar.e);
                if (iA4 == 0) {
                    iA4 = 1;
                }
                if (i4 == iA4) {
                    exugVar = exugVar2;
                    break;
                }
                i3++;
            }
            if (exugVar == null || exugVar != this.b) {
                o(102, "No acceptable handshake cipher found");
            }
            if ((exvaVar.b & 8) == 0) {
                o(104, "No public key found in ServerInit");
            }
            this.g = i(exvaVar.f.I());
            this.e = bArr;
            this.f = 3;
            return;
        }
        if (i2 != 3) {
            if (i2 != 5) {
                c("Cannot parse message in state ".concat(exuh.a(i)));
                return;
            }
            try {
                exuyVar3 = (exuy) evsn.parseFrom(exuy.a, bArr);
            } catch (evtj e2) {
                l("Can't parse message 3", e2);
                exuyVar3 = null;
            }
            if ((exuyVar3.b & 1) == 0) {
                throw new exue("Expected, but did not find message type");
            }
            int iA5 = exux.a(exuyVar3.c);
            if (iA5 != 0 && iA5 == 2) {
                m(exuyVar3);
            }
            int iA6 = exux.a(exuyVar3.c);
            if (iA6 == 0 || iA6 != 5) {
                k("Expected, but did not find CLIENT_FINISH message type");
            }
            if (this.b.ordinal() != 0) {
                c("Unexpected handshakeCipher");
                bArrF = null;
            } else {
                bArrF = f(bArr);
            }
            if (!MessageDigest.isEqual(bArrF, this.i)) {
                k("Commitment does not match");
            }
            if ((exuyVar3.b & 2) == 0) {
                k("Expected message data, but didn't find it");
            }
            try {
                exuoVar = (exuo) evsn.parseFrom(exuo.a, exuyVar3.d);
            } catch (evtj e3) {
                j(e3);
            }
            if ((exuoVar.b & 1) == 0) {
                k("No public key found in ClientFinished");
            }
            try {
                this.g = i(exuoVar.c.I());
            } catch (exuf e4) {
                j(e4);
            }
            this.f = 7;
            return;
        }
        try {
            exuyVar2 = (exuy) evsn.parseFrom(exuy.a, bArr);
        } catch (evtj e5) {
            o(1, "Can't parse message 1 ".concat(String.valueOf(e5.getMessage())));
            exuyVar2 = null;
        }
        if ((exuyVar2.b & 1) == 0 || (iA = exux.a(exuyVar2.c)) == 0 || iA != 3) {
            o(2, "Expected, but did not find ClientInit message type");
        }
        if ((exuyVar2.b & 2) == 0) {
            o(4, "Expected message data, but didn't find it");
        }
        try {
            exusVar = (exus) evsn.parseFrom(exus.a, exuyVar2.d);
        } catch (evtj unused2) {
            o(4, "Can't parse message data into ClientInit");
        }
        if ((exusVar.b & 1) == 0) {
            o(100, "ClientInit missing version");
        }
        if (exusVar.c != 1) {
            o(100, "ClientInit version mismatch");
        }
        if ((exusVar.b & 2) == 0) {
            o(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ClientInit missing random");
        }
        if (exusVar.d.I().length != 32) {
            o(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ClientInit has incorrect nonce length");
        }
        evtg<exur> evtgVar = exusVar.e;
        if (evtgVar.isEmpty()) {
            o(102, "ClientInit is missing cipher commitments");
        }
        for (exur exurVar : evtgVar) {
            int i5 = exurVar.b;
            if ((i5 & 1) == 0 || (i5 & 2) == 0) {
                o(102, "ClientInit has improperly formatted cipher commitment");
            }
            int iA7 = exuu.a(exurVar.c);
            if (iA7 == 0) {
                iA7 = 1;
            }
            if (iA7 == this.b.b) {
                this.i = exurVar.d.I();
            }
        }
        if (this.i == null) {
            o(102, "No acceptable commitments found");
        }
        if ((exusVar.b & 4) == 0 || !"AES_256_CBC-HMAC_SHA256".equals(exusVar.f)) {
            o(103, "Incorrect next protocol");
        }
        this.d = bArr;
        this.f = 5;
    }

    public final void c(String str) {
        this.f = 11;
        throw new IllegalStateException(str);
    }

    public final void d() {
        int i = this.f;
        if (i != 8) {
            c("Unexpected state: ".concat(exuh.a(i)));
        }
        this.f = 9;
    }

    public final byte[] f(byte[] bArr) throws exue {
        try {
            return MessageDigest.getInstance("SHA-512").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            l("No security provider initialized yet?", e);
            throw new AssertionError();
        }
    }

    public final byte[] g() {
        byte[] bytes;
        int i = this.f;
        if (i != 7) {
            c("Unexpected state: ".concat(exuh.a(i)));
        }
        try {
            this.h = exud.a(this.c.getPrivate(), this.g);
        } catch (InvalidKeyException e) {
            j(e);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.d);
            byteArrayOutputStream.write(this.e);
        } catch (IOException e2) {
            j(e2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArrA = null;
        try {
            bytes = "UKEY2 v1 auth".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e3) {
            j(e3);
            bytes = null;
        }
        try {
            bArrA = exvb.a(this.h, bytes, byteArray);
        } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
            j(e4);
        }
        this.f = 8;
        return Arrays.copyOf(bArrA, 32);
    }

    public final byte[] h(int i, byte[] bArr) {
        exuv exuvVar = (exuv) exuy.a.createBuilder();
        exuvVar.copyOnWrite();
        exuy exuyVar = (exuy) exuvVar.instance;
        exuyVar.c = i - 1;
        exuyVar.b |= 1;
        if (bArr.length == 0) {
            n("Cannot send empty message data for non-alert messages");
        }
        evqs evqsVarX = evqs.x(bArr);
        exuvVar.copyOnWrite();
        exuy exuyVar2 = (exuy) exuvVar.instance;
        exuyVar2.b |= 2;
        exuyVar2.d = evqsVarX;
        return ((exuy) exuvVar.build()).toByteArray();
    }
}
