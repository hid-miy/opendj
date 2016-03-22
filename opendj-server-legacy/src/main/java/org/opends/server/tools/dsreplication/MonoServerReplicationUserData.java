/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions Copyright [year] [name of copyright owner]".
 *
 * Copyright 2008-2009 Sun Microsystems, Inc.
 * Portions Copyright 2016 ForgeRock AS.
 */
package org.opends.server.tools.dsreplication;

import org.opends.server.types.HostPort;

/** This is an abstract class used for code factorization. */
abstract class MonoServerReplicationUserData extends ReplicationUserData
{
  private HostPort hostPort = new HostPort(null, 0);
  private boolean useStartTLS;
  private boolean useSSL;

  /**
   * Returns the host name and port of the server.
   * @return the host name and port of the server.
   */
  public HostPort getHostPort()
  {
    return hostPort;
  }

  /**
   * Sets the host name and port of the server.
   * @param hostPort the host name and port of the server.
   */
  public void setHostPort(HostPort hostPort)
  {
    this.hostPort = hostPort;
  }

  /**
   * Returns <CODE>true</CODE> if we must use SSL to connect to the server and
   * <CODE>false</CODE> otherwise.
   * @return <CODE>true</CODE> if we must use SSL to connect to the server and
   * <CODE>false</CODE> otherwise.
   */
  boolean useSSL()
  {
    return useSSL;
  }

  /**
   * Sets whether we must use SSL to connect to the server or not.
   * @param useSSL whether we must use SSL to connect to the server or not.
   */
  void setUseSSL(boolean useSSL)
  {
    this.useSSL = useSSL;
  }

  /**
   * Returns <CODE>true</CODE> if we must use StartTLS to connect to the server
   * and <CODE>false</CODE> otherwise.
   * @return <CODE>true</CODE> if we must use StartTLS to connect to the server
   * and <CODE>false</CODE> otherwise.
   */
  boolean useStartTLS()
  {
    return useStartTLS;
  }

  /**
   * Sets whether we must use StartTLS to connect to the server or not.
   * @param useStartTLS whether we must use SSL to connect to the server or not.
   */
  void setUseStartTLS(boolean useStartTLS)
  {
    this.useStartTLS = useStartTLS;
  }
}
