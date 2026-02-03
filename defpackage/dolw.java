package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dolw {
    public static final dltc a(dokx dokxVar) {
        dmbu dmbuVar;
        int i;
        int i2;
        int i3 = dokxVar.c;
        int i4 = 0;
        int i5 = 3;
        if (i3 == 200) {
            int i6 = ((dokp) dokxVar.d).b;
            if (i6 == 0) {
                i4 = 3;
            } else if (i6 == 100) {
                i4 = 1;
            } else if (i6 == 101) {
                i4 = 2;
            }
            if (i4 == 0) {
                throw null;
            }
            int i7 = i4 - 1;
            if (i7 == 0) {
                return dmbp.a;
            }
            if (i7 == 1) {
                return dmbr.a;
            }
            if (i7 != 2) {
                throw new fctg();
            }
            Class<?> cls = dokxVar.getClass();
            int i8 = fdcj.a;
            throw new IllegalStateException("GallerySource proto has no source set during deserialization in local media: ".concat(String.valueOf(new fdbi(cls).c())));
        }
        if (i3 == 201) {
            doku dokuVar = (doku) dokxVar.d;
            dokuVar.getClass();
            int i9 = dokuVar.c;
            doks doksVar = i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? null : doks.POPUP_CAMERA : doks.FULLSCREEN : doks.MINI_CAMERA : doks.CAMERA_LAYOUT_UNKNOWN;
            if (doksVar == null) {
                doksVar = doks.UNRECOGNIZED;
            }
            doksVar.getClass();
            int iOrdinal = doksVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    dmbuVar = dmbu.a;
                } else if (iOrdinal == 2) {
                    dmbuVar = dmbu.b;
                } else if (iOrdinal == 3) {
                    dmbuVar = dmbu.c;
                } else if (iOrdinal != 4) {
                    throw new fctg();
                }
                dmbu dmbuVar2 = dmbuVar;
                int i10 = dokuVar.d;
                dokr dokrVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? null : dokr.FRONT : dokr.BACK : dokr.CAMERA_FACING_UNKNOWN;
                if (dokrVar == null) {
                    dokrVar = dokr.UNRECOGNIZED;
                }
                dokrVar.getClass();
                int iOrdinal2 = dokrVar.ordinal();
                if (iOrdinal2 == 0) {
                    i = 1;
                } else if (iOrdinal2 == 1) {
                    i = 2;
                } else {
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new fctg();
                        }
                        Class<?> cls2 = dokrVar.getClass();
                        int i11 = fdcj.a;
                        fdbi fdbiVar = new fdbi(cls2);
                        fdbiVar.toString();
                        throw new IllegalStateException("Unknown in app camera source facing value during deserialization in local media: ".concat(fdbiVar.toString()));
                    }
                    i = 3;
                }
                int i12 = dokuVar.e;
                dokt doktVar = i12 != 0 ? i12 != 1 ? i12 != 2 ? null : dokt.LANDSCAPE : dokt.PORTRAIT : dokt.ORIENTATION_UNKNOWN;
                if (doktVar == null) {
                    doktVar = dokt.UNRECOGNIZED;
                }
                doktVar.getClass();
                int iOrdinal3 = doktVar.ordinal();
                if (iOrdinal3 == 0) {
                    i2 = 1;
                } else if (iOrdinal3 == 1) {
                    i2 = 2;
                } else {
                    if (iOrdinal3 != 2) {
                        if (iOrdinal3 != 3) {
                            throw new fctg();
                        }
                        Class<?> cls3 = doktVar.getClass();
                        int i13 = fdcj.a;
                        fdbi fdbiVar2 = new fdbi(cls3);
                        fdbiVar2.toString();
                        throw new IllegalStateException("Unknown in app camera source orientation during deserialization in local media: ".concat(fdbiVar2.toString()));
                    }
                    i2 = 3;
                }
                return new dmbx(dmbuVar2, i, i2, dokuVar.f, null, (dokuVar.b & 16) == 0 ? null : dokuVar.g);
            }
            Class<?> cls4 = doksVar.getClass();
            int i14 = fdcj.a;
            fdbi fdbiVar3 = new fdbi(cls4);
            fdbiVar3.toString();
            throw new IllegalStateException("Unknown in app camera source camera layout during deserialization in local media: ".concat(fdbiVar3.toString()));
        }
        if (i3 == 202) {
            return dmbz.a;
        }
        if (i3 == 203) {
            dokj dokjVar = dokxVar.c == 203 ? (dokj) dokxVar.d : dokj.a;
            dokjVar.getClass();
            return new dnvr(dokjVar);
        }
        dltt dlttVar = dokxVar.f;
        if (dlttVar == null) {
            dlttVar = dltt.a;
        }
        dlttVar.getClass();
        if (dltz.c(dlttVar)) {
            dltt dlttVar2 = dokxVar.f;
            if (dlttVar2 == null) {
                dlttVar2 = dltt.a;
            }
            dlttVar2.getClass();
            return dltz.a(dlttVar2);
        }
        dluj dlujVar = dokxVar.e;
        if (dlujVar == null) {
            dlujVar = dluj.a;
        }
        dlujVar.getClass();
        int i15 = dlujVar.b;
        if (dlug.b(i15) == 0 || dlug.b(i15) == 1) {
            throw new IllegalArgumentException("Attachment source wasn't set");
        }
        if (i15 != 201) {
            if (i15 != 202) {
                if (i15 == 200) {
                    return dltb.a;
                }
                int iB = dlug.b(i15);
                Objects.toString(dlug.a(iB));
                throw new IllegalStateException("Unrecognized source serialized as ".concat(dlug.a(iB)));
            }
            int i16 = ((dluf) dlujVar.c).c;
            if (i16 == 0) {
                i4 = 2;
            } else if (i16 == 1) {
                i4 = 3;
            }
            if (i4 == 0) {
                i4 = 1;
            }
            if (i4 - 2 == 1) {
                return new dlsz();
            }
            throw new IllegalStateException("Unrecognized remote source category during attachment deserialization");
        }
        dlud dludVar = (dlud) dlujVar.c;
        dlud dludVar2 = 1 != (dludVar.b & 1) ? null : dludVar;
        String str = dludVar2 != null ? dludVar2.c : null;
        int i17 = dludVar.d;
        if (i17 == 0) {
            i4 = 2;
        } else if (i17 == 1) {
            i4 = 3;
        } else if (i17 == 2) {
            i4 = 4;
        } else if (i17 == 3) {
            i4 = 5;
        } else if (i17 == 4) {
            i4 = 6;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        int i18 = i4 - 2;
        if (i18 == 0) {
            i5 = 1;
        } else if (i18 == 1) {
            i5 = 2;
        } else if (i18 != 2) {
            if (i18 == 3) {
                i5 = 4;
            } else {
                if (i18 != 4) {
                    throw new IllegalStateException("Unrecognized external source entrypoint during attachment deserialization");
                }
                i5 = 5;
            }
        }
        return new dlsx(str, i5);
    }

    public static final dokx b(dojw dojwVar) {
        doks doksVar;
        int i;
        dokd dokdVar = (dokd) dokx.a.createBuilder();
        dokdVar.getClass();
        dlub dlubVar = (dlub) dluj.a.createBuilder();
        dlubVar.getClass();
        dltc dltcVarFo = dojwVar.fo();
        if (dltcVarFo instanceof dlsx) {
            dluc dlucVar = (dluc) dlud.a.createBuilder();
            dlucVar.getClass();
            dlsx dlsxVar = (dlsx) dltcVarFo;
            String str = dlsxVar.a;
            if (str != null) {
                dlucVar.copyOnWrite();
                dlud dludVar = (dlud) dlucVar.instance;
                dludVar.b |= 1;
                dludVar.c = str;
            }
            int i2 = dlsxVar.b - 1;
            if (i2 != 0) {
                i = 3;
                if (i2 != 1) {
                    i = i2 != 2 ? i2 != 3 ? 6 : 5 : 4;
                }
            } else {
                i = 2;
            }
            dlucVar.copyOnWrite();
            dlud dludVar2 = (dlud) dlucVar.instance;
            dludVar2.d = i - 2;
            dludVar2.b |= 2;
            evsn evsnVarBuild = dlucVar.build();
            evsnVarBuild.getClass();
            dlubVar.copyOnWrite();
            dluj dlujVar = (dluj) dlubVar.instance;
            dlujVar.c = (dlud) evsnVarBuild;
            dlujVar.b = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
        } else if (dltcVarFo instanceof dlsz) {
            dlue dlueVar = (dlue) dluf.a.createBuilder();
            dlueVar.getClass();
            int i3 = ((dlsz) dltcVarFo).a;
            dlueVar.copyOnWrite();
            dluf dlufVar = (dluf) dlueVar.instance;
            dlufVar.c = 1;
            dlufVar.b |= 1;
            evsn evsnVarBuild2 = dlueVar.build();
            evsnVarBuild2.getClass();
            dlubVar.copyOnWrite();
            dluj dlujVar2 = (dluj) dlubVar.instance;
            dlujVar2.c = (dluf) evsnVarBuild2;
            dlujVar2.b = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
        } else if (dltcVarFo instanceof dltb) {
            dluh dluhVar = (dluh) dlui.a.createBuilder();
            dluhVar.getClass();
            evsn evsnVarBuild3 = dluhVar.build();
            evsnVarBuild3.getClass();
            dlubVar.copyOnWrite();
            dluj dlujVar3 = (dluj) dlubVar.instance;
            dlujVar3.c = (dlui) evsnVarBuild3;
            dlujVar3.b = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        evsn evsnVarBuild4 = dlubVar.build();
        evsnVarBuild4.getClass();
        dokdVar.copyOnWrite();
        dokx dokxVar = (dokx) dokdVar.instance;
        dokxVar.e = (dluj) evsnVarBuild4;
        dokxVar.b |= 1;
        dolb.b(dltz.b(dojwVar), dokdVar);
        donb donbVarE = donc.e(fcva.b(donf.a(dojwVar)));
        dokdVar.copyOnWrite();
        dokx dokxVar2 = (dokx) dokdVar.instance;
        dokxVar2.g = donbVarE;
        dokxVar2.b |= 4;
        dltc dltcVarFo2 = dojwVar.fo();
        if (dltcVarFo2 instanceof dojs) {
            dojs dojsVar = (dojs) dltcVarFo2;
            if (dojsVar instanceof dmbs) {
                dokk dokkVar = (dokk) dokp.a.createBuilder();
                dokkVar.getClass();
                dmbs dmbsVar = (dmbs) dojsVar;
                if (fdbq.f(dmbsVar, dmbp.a)) {
                    dokl doklVar = (dokl) dokm.a.createBuilder();
                    doklVar.getClass();
                    evsn evsnVarBuild5 = doklVar.build();
                    evsnVarBuild5.getClass();
                    dokkVar.copyOnWrite();
                    dokp dokpVar = (dokp) dokkVar.instance;
                    dokpVar.c = (dokm) evsnVarBuild5;
                    dokpVar.b = 100;
                } else {
                    if (!fdbq.f(dmbsVar, dmbr.a)) {
                        throw new fctg();
                    }
                    dokn doknVar = (dokn) doko.a.createBuilder();
                    doknVar.getClass();
                    evsn evsnVarBuild6 = doknVar.build();
                    evsnVarBuild6.getClass();
                    dokkVar.copyOnWrite();
                    dokp dokpVar2 = (dokp) dokkVar.instance;
                    dokpVar2.c = (doko) evsnVarBuild6;
                    dokpVar2.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                }
                evsn evsnVarBuild7 = dokkVar.build();
                evsnVarBuild7.getClass();
                dokdVar.copyOnWrite();
                dokx dokxVar3 = (dokx) dokdVar.instance;
                dokxVar3.d = (dokp) evsnVarBuild7;
                dokxVar3.c = BasePaymentResult.ERROR_REQUEST_FAILED;
            } else if (dojsVar instanceof dmbx) {
                dokq dokqVar = (dokq) doku.a.createBuilder();
                dokqVar.getClass();
                dmbx dmbxVar = (dmbx) dojsVar;
                int iOrdinal = dmbxVar.a.ordinal();
                if (iOrdinal == 0) {
                    doksVar = doks.MINI_CAMERA;
                } else if (iOrdinal == 1) {
                    doksVar = doks.FULLSCREEN;
                } else {
                    if (iOrdinal != 2) {
                        throw new fctg();
                    }
                    doksVar = doks.POPUP_CAMERA;
                }
                doksVar.getClass();
                dokqVar.copyOnWrite();
                doku dokuVar = (doku) dokqVar.instance;
                dokuVar.c = doksVar.a();
                dokuVar.b |= 1;
                int i4 = dmbxVar.e - 1;
                dokr dokrVar = i4 != 1 ? i4 != 2 ? dokr.CAMERA_FACING_UNKNOWN : dokr.FRONT : dokr.BACK;
                dokrVar.getClass();
                dokqVar.copyOnWrite();
                doku dokuVar2 = (doku) dokqVar.instance;
                dokuVar2.d = dokrVar.a();
                dokuVar2.b |= 2;
                int i5 = dmbxVar.f - 1;
                dokt doktVar = i5 != 1 ? i5 != 2 ? dokt.ORIENTATION_UNKNOWN : dokt.LANDSCAPE : dokt.PORTRAIT;
                doktVar.getClass();
                dokqVar.copyOnWrite();
                doku dokuVar3 = (doku) dokqVar.instance;
                dokuVar3.e = doktVar.a();
                dokuVar3.b |= 4;
                boolean z = dmbxVar.b;
                dokqVar.copyOnWrite();
                doku dokuVar4 = (doku) dokqVar.instance;
                dokuVar4.b |= 8;
                dokuVar4.f = z;
                String str2 = dmbxVar.d;
                if (str2 != null) {
                    dokqVar.copyOnWrite();
                    doku dokuVar5 = (doku) dokqVar.instance;
                    dokuVar5.b |= 16;
                    dokuVar5.g = str2;
                }
                evsn evsnVarBuild8 = dokqVar.build();
                evsnVarBuild8.getClass();
                dokdVar.copyOnWrite();
                dokx dokxVar4 = (dokx) dokdVar.instance;
                dokxVar4.d = (doku) evsnVarBuild8;
                dokxVar4.c = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
            } else if (dojsVar instanceof dmbz) {
                dokv dokvVar = (dokv) dokw.a.createBuilder();
                dokvVar.getClass();
                evsn evsnVarBuild9 = dokvVar.build();
                evsnVarBuild9.getClass();
                dokdVar.copyOnWrite();
                dokx dokxVar5 = (dokx) dokdVar.instance;
                dokxVar5.d = (dokw) evsnVarBuild9;
                dokxVar5.c = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
            } else if (dojsVar instanceof dnvr) {
                dokj dokjVar = ((dnvr) dojsVar).c;
                dokdVar.copyOnWrite();
                dokx dokxVar6 = (dokx) dokdVar.instance;
                dokxVar6.d = dokjVar;
                dokxVar6.c = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
            }
        }
        return dolb.a(dokdVar);
    }
}
