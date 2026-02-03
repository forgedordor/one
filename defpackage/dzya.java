package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzya {
    private static volatile ejwi a;

    private dzya() {
    }

    public static ejwi a(Context context) {
        ejwi ejwiVar;
        ejwi ejwiVarJ;
        ejwi ejwiVarJ2;
        ejwi ejwiVar2 = a;
        if (ejwiVar2 != null) {
            return ejwiVar2;
        }
        synchronized (dzya.class) {
            ejwiVar = a;
            if (ejwiVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                int i = dzyc.a;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    Context contextA = dqyw.a(context);
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(contextA.getDir("phenotype_hermetic", 0), "overrides.txt");
                            ejwiVarJ = file.exists() ? ejwi.j(file) : ejud.a;
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            ejwiVarJ = ejud.a;
                        }
                        if (ejwiVarJ.g()) {
                            Object objC = ejwiVarJ.c();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objC)));
                                try {
                                    cvw cvwVar = new cvw();
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", a.v(line, "Invalid: "));
                                        } else {
                                            String str3 = new String(strArrSplit[0]);
                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String str4 = new String(strArrSplit[2]);
                                                strDecode2 = Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            cvw cvwVar2 = (cvw) cvwVar.get(str3);
                                            if (cvwVar2 == null) {
                                                cvwVar2 = new cvw();
                                                cvwVar.put(str3, cvwVar2);
                                            }
                                            cvwVar2.put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + objC.toString() + " for Android package " + contextA.getPackageName());
                                    dzxt dzxtVar = new dzxt(cvwVar);
                                    bufferedReader.close();
                                    ejwiVarJ2 = ejwi.j(dzxtVar);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else {
                            ejwiVarJ2 = ejud.a;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    ejwiVarJ2 = ejud.a;
                }
                ejwiVar = ejwiVarJ2;
                a = ejwiVar;
            }
        }
        return ejwiVar;
    }
}
