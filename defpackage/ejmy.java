package defpackage;

import com.google.chat.smartmessaging.smartreply.android.models.mediapipe.TextClassifier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmy implements ejmp {
    private int a;
    private TextClassifier b;
    private boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[Catch: Exception -> 0x0096, TRY_LEAVE, TryCatch #1 {Exception -> 0x0096, blocks: (B:9:0x0018, B:11:0x0028, B:13:0x0055, B:14:0x005b, B:16:0x0061, B:17:0x0072, B:18:0x0080), top: B:34:0x0018, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ejmy(android.content.Context r5, defpackage.ejin r6, defpackage.ejly r7) {
        /*
            r4 = this;
            r4.<init>()
            int r0 = r6.d
            r4.a = r0
            boolean r0 = r6.e
            r4.c = r0
            r0 = 0
            ejha r6 = r6.c     // Catch: java.lang.Exception -> Lba
            if (r6 != 0) goto L12
            ejha r6 = defpackage.ejha.a     // Catch: java.lang.Exception -> Lba
        L12:
            int r1 = r6.b     // Catch: java.lang.Exception -> Lba
            r2 = r1 & 1
            if (r2 == 0) goto La4
            com.google.common.util.concurrent.ListenableFuture r1 = r7.d(r6)     // Catch: java.lang.Exception -> L96
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L96
            j$.util.Optional r1 = (j$.util.Optional) r1     // Catch: java.lang.Exception -> L96
            boolean r1 = r1.isPresent()     // Catch: java.lang.Exception -> L96
            if (r1 == 0) goto L80
            com.google.common.util.concurrent.ListenableFuture r1 = r7.d(r6)     // Catch: java.lang.Exception -> L96
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L96
            j$.util.Optional r1 = (j$.util.Optional) r1     // Catch: java.lang.Exception -> L96
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L96
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L96
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Exception -> L96
            java.util.List r1 = r1.getPathSegments()     // Catch: java.lang.Exception -> L96
            java.io.File r2 = r5.getFilesDir()     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L96
            r3 = 0
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L96
            boolean r2 = r2.endsWith(r3)     // Catch: java.lang.Exception -> L96
            if (r2 == 0) goto L80
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L96
            r7.<init>()     // Catch: java.lang.Exception -> L96
            r2 = 1
        L5b:
            int r3 = r1.size()     // Catch: java.lang.Exception -> L96
            if (r2 >= r3) goto L72
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L96
            r7.append(r3)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Exception -> L96
            r7.append(r3)     // Catch: java.lang.Exception -> L96
            int r2 = r2 + 1
            goto L5b
        L72:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L96
            java.io.File r2 = r5.getFilesDir()     // Catch: java.lang.Exception -> L96
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L96
            r1.<init>(r2, r7)     // Catch: java.lang.Exception -> L96
            goto Lb1
        L80:
            cdta r7 = r7.i(r6)     // Catch: java.lang.Exception -> L96
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L96
            java.lang.String r7 = r7.a()     // Catch: java.lang.Exception -> L96
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Exception -> L96
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L96
            r1.<init>(r7)     // Catch: java.lang.Exception -> L96
            goto Lb1
        L96:
            int r7 = r6.b     // Catch: java.lang.Exception -> Lba
            r7 = r7 & 2
            if (r7 == 0) goto Lb0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> Lba
            java.lang.String r6 = r6.d     // Catch: java.lang.Exception -> Lba
            r1.<init>(r6)     // Catch: java.lang.Exception -> Lba
            goto Lb1
        La4:
            r7 = r1 & 2
            if (r7 == 0) goto Lb0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> Lba
            java.lang.String r6 = r6.d     // Catch: java.lang.Exception -> Lba
            r1.<init>(r6)     // Catch: java.lang.Exception -> Lba
            goto Lb1
        Lb0:
            r1 = r0
        Lb1:
            if (r1 == 0) goto Lb9
            com.google.chat.smartmessaging.smartreply.android.models.mediapipe.TextClassifier r5 = com.google.chat.smartmessaging.smartreply.android.models.mediapipe.TextClassifier.a(r5, r1)     // Catch: java.lang.Exception -> Lba
            r4.b = r5     // Catch: java.lang.Exception -> Lba
        Lb9:
            return
        Lba:
            r4.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejmy.<init>(android.content.Context, ejin, ejly):void");
    }

    @Override // defpackage.ejmp
    public final ekgb a(ezdx ezdxVar, String str, ejqq ejqqVar) {
        if (ezdxVar == null) {
            int i = ekgb.d;
            return ekoe.a;
        }
        if (this.b == null) {
            int i2 = ekgb.d;
            return ekoe.a;
        }
        int i3 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int i4 = this.a;
        if (i4 > 0) {
            int size = ezdxVar.b.size();
            ezdw ezdwVar = (ezdw) ezdxVar.toBuilder();
            ezdwVar.copyOnWrite();
            ((ezdx) ezdwVar.instance).b = ezdx.emptyProtobufList();
            ezdwVar.a(ezdxVar.b.subList(Math.max(size - i4, 0), size));
            ezdxVar = (ezdx) ezdwVar.build();
        }
        evtg<ezdv> evtgVar = ezdxVar.b;
        if (!evtgVar.isEmpty()) {
            ezdv ezdvVar = (ezdv) ekis.j(evtgVar);
            if (!(ezdvVar.b == 30 ? (String) ezdvVar.c : "").isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (ezdv ezdvVar2 : evtgVar) {
                    String str2 = ezdvVar2.d;
                    String str3 = ezdvVar2.b == 30 ? (String) ezdvVar2.c : "";
                    if (this.c) {
                        if (str2.equalsIgnoreCase(str)) {
                            sb.append("[user]: ");
                        } else {
                            sb.append("[remote]: ");
                        }
                    }
                    sb.append(str3);
                    sb.append("\n");
                }
                ejne ejneVarB = this.b.b(sb.toString());
                ejneVarB.b();
                if (!((euyf) ejneVarB.b()).a.isEmpty()) {
                    for (euyj euyjVar : ((euyf) ejneVarB.b()).a) {
                        if (!euyjVar.c().isEmpty()) {
                            for (euyh euyhVar : euyjVar.c()) {
                                ejmn ejmnVarF = ejmo.f();
                                ejmnVarF.c(euyhVar.c());
                                ejmnVarF.d(euyhVar.a());
                                ejmnVarF.e(ezal.MEDIAPIPE_TEXT_CLASSIFIER);
                                ekfwVar.h(ejmnVarF.a());
                            }
                        }
                    }
                }
                return ekfwVar.g();
            }
        }
        return ekoe.a;
    }

    @Override // defpackage.ejmp
    public final void b() {
        TextClassifier textClassifier = this.b;
        if (textClassifier != null) {
            textClassifier.close();
            this.b = null;
        }
    }
}
