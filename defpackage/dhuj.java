package defpackage;

import android.util.StatsEvent;
import android.util.StatsLog;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhuj implements dhuh {
    private final Map a;
    private final Optional b;

    public dhuj(Map map, Optional optional) {
        this.a = map;
        this.b = optional;
    }

    @Override // defpackage.dhuh
    public final void a(dhnv dhnvVar, dhwj dhwjVar, sfp sfpVar) {
        Object next;
        int i;
        String str;
        dhwjVar.getClass();
        Iterator it = dhwjVar.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((dhwg) next).d != null) {
                    break;
                }
            }
        }
        dhwg dhwgVar = (dhwg) next;
        dhuy dhuyVar = (dhuy) this.a.get(dhnvVar.b);
        if (dhuyVar == null) {
            dhuyVar = dhuy.a;
        }
        String str2 = dhnvVar.a;
        long jB = dhua.b(dhnvVar);
        evqs evqsVar = dhwjVar.e;
        long j = dhwjVar.b;
        byte[] bArrI = evqsVar.I();
        long jG = fdhi.g(j);
        long jG2 = dhwgVar != null ? fdhi.g(dhwgVar.b) : 0L;
        dhvp dhvpVar = dhwjVar.a;
        int i2 = 7;
        int i3 = 2;
        switch (dhui.b(dhvpVar.a) - 1) {
            case 0:
                i = 8;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 9;
                break;
        }
        int iA = dhui.a(dhvpVar.b) - 1;
        if (iA != 0) {
            if (iA == 1) {
                i2 = i3;
            } else {
                if (iA == 2) {
                    i3 = 3;
                } else if (iA != 3) {
                    i2 = iA != 4 ? 6 : 5;
                } else {
                    i3 = 4;
                }
                i2 = i3;
            }
        }
        if (dhwgVar == null || (str = dhwgVar.d) == null) {
            str = "";
        }
        int iC = dhua.c(dhwjVar.f) - 1;
        int i4 = dhuyVar.f;
        int i5 = dhuyVar.g;
        int i6 = dhuyVar.h;
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(211400);
        builderNewBuilder.writeString(str2);
        builderNewBuilder.writeLong(jB);
        if (bArrI == null) {
            bArrI = new byte[0];
        }
        builderNewBuilder.writeByteArray(bArrI);
        builderNewBuilder.writeLong(jG);
        builderNewBuilder.writeLong(jG2);
        builderNewBuilder.writeInt(i - 1);
        builderNewBuilder.writeInt(i2 - 1);
        builderNewBuilder.writeString(str);
        builderNewBuilder.writeInt(iC);
        builderNewBuilder.writeLong(0L);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    @Override // defpackage.dhuh
    public final void b(dhnv dhnvVar, evqs evqsVar, sep sepVar) {
        int iA;
        int iA2;
        int iA3;
        dhnvVar.getClass();
        dhuy dhuyVar = (dhuy) this.a.get(dhnvVar.b);
        if (dhuyVar == null) {
            dhuyVar = dhuy.a;
        }
        int i = sepVar.c;
        int iA4 = sfl.a(i);
        int i2 = 3;
        int i3 = 2;
        if ((iA4 != 0 && iA4 == 2) || (((iA = sfl.a(i)) != 0 && iA == 7) || (((iA2 = sfl.a(i)) != 0 && iA2 == 8) || ((iA3 = sfl.a(i)) != 0 && iA3 == 10)))) {
            String str = dhnvVar.a;
            long jB = dhua.b(dhnvVar);
            byte[] bArrI = evqsVar.I();
            long j = sepVar.d;
            int iA5 = sfn.a(sepVar.f);
            if (iA5 == 0) {
                iA5 = 1;
            }
            int iA6 = dhua.a(sepVar);
            sdt sdtVar = sepVar.e;
            if (sdtVar == null) {
                sdtVar = sdt.a;
            }
            int iA7 = sez.a(sdtVar.d);
            if (iA7 == 0) {
                iA7 = 1;
            }
            int iA8 = sfl.a(sepVar.c);
            if (iA8 == 0) {
                iA8 = 1;
            }
            int i4 = iA8 - 1;
            if (i4 == 1) {
                i3 = 1;
            } else if (i4 == 9) {
                i3 = 4;
            } else if (i4 != 6) {
                i3 = i4 != 7 ? 0 : 3;
            }
            int i5 = dhuyVar.f;
            int i6 = dhuyVar.g;
            int i7 = dhuyVar.h;
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(211403);
            builderNewBuilder.writeString(str);
            builderNewBuilder.writeLong(jB);
            if (bArrI == null) {
                bArrI = new byte[0];
            }
            builderNewBuilder.writeByteArray(bArrI);
            builderNewBuilder.writeLong(j);
            builderNewBuilder.writeInt(iA5 - 1);
            builderNewBuilder.writeInt(iA6);
            builderNewBuilder.writeInt(iA7 - 1);
            builderNewBuilder.writeInt(i3);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeLong(0L);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
            return;
        }
        String str2 = dhnvVar.a;
        long jB2 = dhua.b(dhnvVar);
        long j2 = sepVar.d;
        int iA9 = sfn.a(sepVar.f);
        if (iA9 == 0) {
            iA9 = 1;
        }
        int iA10 = sfl.a(sepVar.c);
        if (iA10 == 0) {
            iA10 = 1;
        }
        int i8 = iA10 - 1;
        if (i8 == 2) {
            i2 = 1;
        } else if (i8 == 3) {
            i2 = 2;
        } else if (i8 != 4) {
            i2 = 5;
            if (i8 == 5) {
                i2 = 4;
            } else if (i8 != 8) {
                i2 = i8 != 10 ? 0 : 6;
            }
        }
        sdt sdtVar2 = sepVar.e;
        if (sdtVar2 == null) {
            sdtVar2 = sdt.a;
        }
        int iA11 = sez.a(sdtVar2.d);
        if (iA11 == 0) {
            iA11 = 1;
        }
        int iA12 = dhua.a(sepVar);
        int i9 = dhuyVar.f;
        int i10 = dhuyVar.g;
        int i11 = dhuyVar.h;
        int iA13 = sfd.a(sepVar.g);
        int i12 = iA13 == 0 ? 1 : iA13;
        StatsEvent.Builder builderNewBuilder2 = StatsEvent.newBuilder();
        builderNewBuilder2.setAtomId(211404);
        builderNewBuilder2.writeString(str2);
        builderNewBuilder2.writeLong(jB2);
        builderNewBuilder2.writeLong(j2);
        builderNewBuilder2.writeInt(iA9 - 1);
        builderNewBuilder2.writeInt(i2);
        builderNewBuilder2.writeInt(iA11 - 1);
        builderNewBuilder2.writeInt(iA12);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(i12 - 1);
        builderNewBuilder2.writeLong(0L);
        builderNewBuilder2.usePooledBuffer();
        StatsLog.write(builderNewBuilder2.build());
    }

    @Override // defpackage.dhuh
    public final void c(dhnv dhnvVar, evqs evqsVar, ser serVar) {
        dhnvVar.getClass();
    }

    @Override // defpackage.dhuh
    public final void d(dhnv dhnvVar, evqs evqsVar, long j, dhuo dhuoVar, int i, int i2) {
        dhnvVar.getClass();
        evqsVar.getClass();
        dhuoVar.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        dhuy dhuyVar = (dhuy) this.a.get(dhnvVar.b);
        if (dhuyVar == null) {
            dhuyVar = dhuy.a;
        }
        String str = dhnvVar.a;
        long jB = dhua.b(dhnvVar);
        byte[] bArrI = evqsVar.I();
        int iC = dhua.c(dhuoVar) - 1;
        int iA = dhue.a(i);
        int i3 = dhuyVar.f;
        int i4 = dhuyVar.g;
        int i5 = dhuyVar.h;
        int iA2 = ewtg.a(i2);
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(211407);
        builderNewBuilder.writeString(str);
        builderNewBuilder.writeLong(jB);
        if (bArrI == null) {
            bArrI = new byte[0];
        }
        builderNewBuilder.writeByteArray(bArrI);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(iC);
        builderNewBuilder.writeInt(iA - 1);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(iA2);
        builderNewBuilder.writeLong(0L);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    @Override // defpackage.dhuh
    public final void e(dhnv dhnvVar, long j, evqs evqsVar, int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        dhuy dhuyVar = (dhuy) this.a.get(dhnvVar.b);
        if (dhuyVar == null) {
            dhuyVar = dhuy.a;
        }
        if (i == 1) {
            String str = dhnvVar.a;
            long jB = dhua.b(dhnvVar);
            byte[] bArrI = evqsVar.I();
            int i3 = dhuyVar.f;
            int i4 = dhuyVar.g;
            int i5 = dhuyVar.h;
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(211401);
            builderNewBuilder.writeString(str);
            builderNewBuilder.writeLong(jB);
            if (bArrI == null) {
                bArrI = new byte[0];
            }
            builderNewBuilder.writeByteArray(bArrI);
            builderNewBuilder.writeLong(j);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeLong(0L);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
            return;
        }
        String str2 = dhnvVar.a;
        long jB2 = dhua.b(dhnvVar);
        int iB = dhue.b(i);
        int i6 = dhuyVar.f;
        int i7 = dhuyVar.g;
        int i8 = dhuyVar.h;
        int iA = ewtg.a(i2);
        StatsEvent.Builder builderNewBuilder2 = StatsEvent.newBuilder();
        builderNewBuilder2.setAtomId(211402);
        builderNewBuilder2.writeString(str2);
        builderNewBuilder2.writeLong(jB2);
        builderNewBuilder2.writeInt(iB - 1);
        builderNewBuilder2.writeLong(j);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(iA);
        builderNewBuilder2.writeLong(0L);
        builderNewBuilder2.usePooledBuffer();
        StatsLog.write(builderNewBuilder2.build());
    }

    @Override // defpackage.dhuh
    public final void f(dhnv dhnvVar, int i) {
        if (((Boolean) fdct.a(this.b, false)).booleanValue()) {
            long jB = dhua.b(dhnvVar);
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(211409);
            builderNewBuilder.writeString(dhnvVar.a);
            builderNewBuilder.writeLong(jB);
            builderNewBuilder.writeLong(0L);
            builderNewBuilder.writeInt(i - 1);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
        }
    }
}
